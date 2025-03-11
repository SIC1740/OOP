

import java.util.Scanner;
// Luu y khi nop nho doi ten class thành Main
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        while (a-- >0){
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.nextLine();
            System.out.println(s);
        }
        sc.close();

    }

}
