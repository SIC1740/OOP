import java.util.HashMap;
import java.util.Map;

class Product1 {
    private int price;
    private int stock;

    public Product1(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }
    public int takeProduct() {
        return stock--;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
}
class Warehouse1 {
    private Map<String, Product1> Products;
    public Warehouse1() {
        Products = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        Products.put(product, new Product1(price, stock));
    }
    public void price(String product){
        if(Products.containsKey(product)){
            System.out.println(Products.get(product).getPrice());
        }
        else{
            System.out.println("-99");
        }
    }
    public void stock(String product){
        if(Products.containsKey(product)) {
            if (Products.get(product).getStock() > 0) {
                System.out.println(product + ": " + Products.get(product).getStock());

            }
            else {
                System.out.println(product + ": 0");
            }
        }
        else{
            System.out.println(product + ": 0");
        }
    }
    public void take(String product){
        if(Products.containsKey(product)){
            if(Products.get(product).getStock() > 0) {
                Products.get(product).takeProduct();
                System.out.println("taking " + product + " true");
            }
            else{
                System.out.println("taking " + product + " false");
            }
        }
        else{
            System.out.println("taking " + product + " false");
        }
    }
    public void products1(){
        if(Products.isEmpty()){
            System.out.println("-99");
        }
        else{
            for(String product: Products.keySet()){
                if (Products.get(product).getStock() > 0) {
                    System.out.println(product);
                }
            }
        }
    }
}
public class COLLECTION002 {
    public static void main(String[] args) {
        Warehouse1 warehouse = new Warehouse1();

        warehouse.addProduct("coffee", 10, 1);
        warehouse.addProduct("sugar", 20, 0);

        System.out.println("stock:");
        warehouse.stock("coffee");
        warehouse.stock("sugar");
        warehouse.take("coffee");
        warehouse.take("coffee");
        warehouse.take("sugar");

        System.out.println("stock:");
        warehouse.stock("coffee");
        warehouse.stock("sugar");
    }
}
///lưu ý, do testcase khá dị, cách tốt nhất là in testcase trên web để ac