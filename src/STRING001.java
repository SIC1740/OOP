import java.util.Scanner;

public class STRING001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.contains(s2)) {
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
        sc.close();
    }
}
//Kiểm tra chuỗi có chứa chuỗi khác không