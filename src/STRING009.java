import java.util.Scanner;

public class STRING009 {
    public static String stringSplosion(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= input.length(); i++) {
            builder.append(input.substring(0, i ));
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(stringSplosion(s));
        }
        sc.close();
    }
}
