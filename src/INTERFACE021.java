import java.util.*;

interface PricedItem{
    Double getPrice();
}
interface SourceableItem{
    String getSourceName();
}
class Dish implements PricedItem, SourceableItem{
    private String name; 
    private double price;
    private String restaurantName;

    public Dish(String name, double price, String restaurantName){
        this.name = name;
        this.price = price;
        this.restaurantName = restaurantName;
    }
    public String getName(){
        return name;
    }
    @Override
    public Double getPrice(){
        return price;
    }
    @Override
    public String getSourceName(){
        return restaurantName;
    }


}
public class INTERFACE021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            List<Dish> order = new ArrayList<>();
            while(true){
                String line = sc.nextLine().trim();
                if(line.equals("Checkout"))
                    break;
                String rest = line.substring(5).trim();

                int fistQuote = rest.indexOf('"');
                int secondQuote = rest.indexOf('"',fistQuote+1);
                String name = rest.substring(fistQuote+1, secondQuote);

                rest = rest.substring(secondQuote+1).trim();

                int spaceAfterPrice = rest.indexOf(" ");
                String priceStr = rest.substring(0,spaceAfterPrice);
                double price = Double.parseDouble(priceStr);

                rest = rest.substring(spaceAfterPrice+1).trim();

                String restaurantName;
                if(rest.startsWith("\"") && rest.endsWith("\"")){
                    restaurantName = rest.substring(1,rest.length()-1);
                }
                else{
                    restaurantName = rest;
                }
                order.add(new Dish(name,price,restaurantName));
            }
            String targetLine = sc.nextLine().trim();
            String target = targetLine;
            if(target.startsWith("\'") && target.endsWith("\"")){
                target = target.substring(1,target.length()-1);
            }
            for(Dish dish : order){
                if(dish.getSourceName().equals(target)){
                    System.out.printf("\"%s\" - %.2f%n",dish.getName(),dish.getPrice());
                }
            }
        }
        sc.close();
    }
}
