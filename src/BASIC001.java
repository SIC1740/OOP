

import java.util.Scanner;
// Luu y khi nop nho doi ten class thành Main
public class BASIC001{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        while (a-- >0){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();

    }

}
