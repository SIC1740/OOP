import java.util.Scanner;

public class BASIC005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int res = a + b + c + d + e;
            System.out.println(res);
        }
    sc.close();
    }
}
