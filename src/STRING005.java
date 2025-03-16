import java.util.Scanner;

public class STRING005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] sp = s.split(" ");
            Integer[] arr = new Integer[sp.length];
            for (int i = 0; i < sp.length; i++) {
                arr[i] = sp[i].length();
            }
            int maxx = 0;
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                if(maxx <= arr[i]) {
                    maxx = arr[i];
                    res = i;
                }
            }
            System.out.println(sp[res]);
        }
        sc.close();
    }
}
//Tìm chuỗi dài nhất