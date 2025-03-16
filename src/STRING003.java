import java.util.Scanner;

public class STRING003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.length());
        }
        sc.close();
    }
}
//Sử dụng Stringbuffer để lấy chiều dài chuỗi