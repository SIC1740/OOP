import java.util.*;

class Product{
    private String productId;
    private String name;
    private double price;
    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("Sản phẩm: " + name + " (Mã: " + productId + ")");
        System.out.println("Giá: " + price);
    }
}
class Order{
    private String orderId;
    private Product product;
    private int quantity;
    public Order(String orderId, Product product, int quantity){
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
    public double calculateTotal() {
        return quantity*product.getPrice();
    }
    public void display(){
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.println("Đơn hàng: " + orderId);
        product.display();
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng tiền: %.1f\n",calculateTotal() );
    }
}
public class OOP011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String productId = sc.nextLine();
        String name = sc.nextLine();
        Double price = Double.parseDouble(sc.nextLine());
        String orderId = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        Product product = new Product(productId,name,price);
        Order order = new Order(orderId,product,quantity);

        order.display();
        sc.close();
    }
}
