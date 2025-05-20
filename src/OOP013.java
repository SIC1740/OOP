import java.util.*;

class Book{
    private String bookId;
    private String tittle;
    private String author;
    public Book(String bookId, String tittle, String author){
        this.bookId = bookId;
        this.tittle = tittle;
        this.author = author;
    }
    public void Display(){
        System.out.println("Sách: " + tittle + " (Mã: " + bookId + ") - " + author);
    }
}
class Borrow{
    private String borrowId;
    private Book book;
    private String borrower;
    private int days;
    
    public Borrow(String borrowId, Book book, String borrower, int days){
        this.borrowId = borrowId;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }
    public double calculateFee(){
        return days*5000.0;
    }
    public void Display(){
        System.out.println("--- Phiếu mượn sách ---");
        System.out.println("Mã phiếu: " + borrowId);
        System.out.println("Người mượn: " + borrower);
        book.Display();
        System.out.println("Số ngày mượn: " + days);
        System.out.println("Phí mượn: " + calculateFee());
    }
}
public class OOP013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String bookId = sc.nextLine();
        String tittle = sc.nextLine();
        String author = sc.nextLine();
        String borrowId = sc.nextLine();
        String borrower = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        
        Book book = new Book(bookId,tittle,author);
        Borrow borrow = new Borrow(borrowId,book, borrower,days);

        borrow.Display();
        sc.close();
    }
}
