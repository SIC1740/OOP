import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class STRING007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            boolean res = isPangram(s);
            System.out.println(res ? "true" : "false");
        }
        sc.close();
    }
    public static boolean isPangram(String s) {
        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}
//Pangram