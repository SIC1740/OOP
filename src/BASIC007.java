// Tính tổng các số thuộc dãy cho trước
import java.util.Scanner;

public class BASIC007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int res = (R+1)*R/2 - L*(L-1)/2;
            System.out.println(res);
        }
        sc.close();
    }
}
