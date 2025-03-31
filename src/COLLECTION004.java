
import java.util.*;
class Items{
    private String product;
    private int quantity;
    private int unitPrice;

    public Items(String product, int quantity, int unitPrice){
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getUnitPrice(){
        return unitPrice;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getPrice(){
        return quantity*unitPrice;
    }

    public void displayInfo(){
        System.out.println("Product: " + product + " has quantity " + quantity + " with price: " + getPrice());
    }
}
class Warehouse2{
    private Map <String,Integer>warehouseStock = new HashMap<>();

    public void addProduct(String product, int quantity, Items items){
        if(items.getQuantity() >= quantity){
            warehouseStock.put(product,warehouseStock.getOrDefault(product,0)+quantity);
            items.setQuantity(items.getQuantity()-quantity);
        }
    }

    public void increaseItemInWarehouseByOne(Items items){
        String product = items.getProduct();
        if(warehouseStock.containsKey(product)){
            int currentStock = warehouseStock.get(product);
            if(items.getQuantity() > 0){
                warehouseStock.put(product,currentStock+1);
                items.setQuantity(items.getQuantity()-1);
            }
        }
    }

    public void takeToItem(String product, int quantity, Items items){
        if(warehouseStock.containsKey(product)){
            int currentStock = warehouseStock.get(product);
            int takenQuantity = Math.min(quantity,currentStock);
            warehouseStock.put(product,currentStock-takenQuantity);
            items.setQuantity(items.getQuantity()+takenQuantity);
        }
    }
    public void importItem(Items items){
        warehouseStock.put(items.getProduct(),0);
    }
}
public class COLLECTION004 {
    public static void main(String[] args) {

        Items milk = new Items("milk",4,2);
        Items buttermilk = new Items("buttermilk",10,2);

        milk.displayInfo();
        buttermilk.displayInfo();

        Warehouse2 warehouse2 = new Warehouse2();
        warehouse2.importItem(milk);
        warehouse2.importItem(buttermilk);

        warehouse2.addProduct("milk",1,milk);
        warehouse2.addProduct("buttermilk",3,buttermilk);

        milk.displayInfo();
        buttermilk.displayInfo();

        warehouse2.increaseItemInWarehouseByOne(buttermilk);
        warehouse2.increaseItemInWarehouseByOne(milk);

        milk.displayInfo();
        buttermilk.displayInfo();

        warehouse2.takeToItem("milk",5,milk);
        warehouse2.takeToItem("buttermilk",1,buttermilk);

        milk.displayInfo();
        buttermilk.displayInfo();
    }
}
