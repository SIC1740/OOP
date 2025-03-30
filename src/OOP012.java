import java.util.*;
class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        setGender(gender);
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        if(gender == 'f' || gender == 'm'){
            this.gender = gender;
        }
    }
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book[name=" + name +", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}
public class OOP012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String type = sc.nextLine();

            if (type.equals("Book")) {
                String bookName = sc.nextLine();
                Double price = Double.parseDouble(sc.nextLine());
                int qty = Integer.parseInt(sc.nextLine());

                String authorType = sc.nextLine();
                if (authorType.equals("Author")) {
                    String authorName = sc.nextLine();
                    String authorEmail = sc.nextLine();
                    char authorGender = sc.next().charAt(0);

                    Author author = new Author(authorName, authorEmail, authorGender);
                    Book book = new Book(bookName, author, price, qty);

                    System.out.println(book.toString());
                }
            }
        }
        sc.close();
    }
}
//Sách và tác giả