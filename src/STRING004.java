import java.util.Scanner;

public class STRING004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            if(s.equalsIgnoreCase(s1))
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();
    }
}
