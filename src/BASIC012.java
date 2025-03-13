import java.util.ArrayList;
import java.util.Scanner;

public class BASIC012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            ArrayList<Integer> li = new ArrayList<>();
            String[] s = sc.nextLine().split(" ");

            for(String str : s) {
                li.add(Integer.parseInt(str));
            }
            if(li.isEmpty()) {
                System.out.println("0");
                continue;
            }
            int maxLen = 1;
            int currentLen = 1;
            for(int i = 1; i < li.size(); i++) {
                if(li.get(i) >= li.get(i-1)) {
                    currentLen++;
                }
                else {
                    if(currentLen > maxLen) {
                        maxLen = currentLen;
                    }
                    currentLen = 1;
                }
            }
            maxLen = Math.max(maxLen, currentLen);
            System.out.println(maxLen);
        }
        sc.close();
    }
}
