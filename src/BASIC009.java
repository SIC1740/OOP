import java.util.Scanner;

public class BASIC009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] swapDigits = s.toCharArray();
            for(int i = (s.length() % 2 ==0)?0:1; i<s.length(); i+=2) {
                char temp = swapDigits[i];
                swapDigits[i] = swapDigits[i+1];
                swapDigits[i+1] = temp;
            }
            System.out.println(swapDigits);
        }
        sc.close();
    }
}
