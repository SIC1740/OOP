import java.util.HashMap;
import java.util.Map;

class Product {
    private int price;
    private int stock;

    public Product(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }
    public int getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
}
class Warehouse{
    private Map<String, Product> products;
    public Warehouse(){
        products = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        products.put(product,new Product(price,stock));
    }
    public String price(String product){
        if(products.containsKey(product)) {
            return product + ": " + products.get(product).getPrice();
        }
        else {
            return product + ": -99";
        }
    }
}
public class COLLECTION001 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk",3,10);
        warehouse.addProduct("coffee",5,7);

        System.out.println("prices:");
        System.out.println(warehouse.price("milk"));
        System.out.println(warehouse.price("coffee"));
        System.out.println(warehouse.price("sugar"));
    }
}
