import java.util.Scanner;

public class STRING006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(c);
                }
            }
            System.out.println("My initials are: " + sb.toString());
        }
        sc.close();
    }
}
