
public class COLLECTION003 {
    public static void main(String[] args) {
        Warehouse1 warehouse = new Warehouse1();
        warehouse.addProduct("milk",3,10);
        warehouse.addProduct("coffee",5,6);
        warehouse.addProduct("buttermilk",6,0);
        warehouse.addProduct("yogurt",2,20);
        warehouse.products1();
    }
}

//Lưu ý lấy 2 class ở bên COLLECTION002 CHO VÀO COLLECTION003
//Vì đây là project nên những phần này link đén nhau