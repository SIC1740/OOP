
import java.util.*;
class Items{
    private int quantity;
    private int unitPrice;
    public Items(int quantity, int unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
}
class Warehouse2{
    private Map <String,Items>products;
    public Warehouse2() {
        products = new HashMap<>();
    }

}
public class COLLECTION004 {
    public static void main(String[] args) {

    }
}
