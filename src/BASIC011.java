import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class BASIC011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            ArrayList<Integer> li = new ArrayList<>();
            String[] s = sc.nextLine().split(" ");

            for(String str : s){
                li.add(Integer.parseInt(str));
            }
            int res = findMin(li);
            System.out.println(res);
        }
        sc.close();
    }
    private static int findMin (ArrayList<Integer>li){
        if(li.size() < 2){
            return 0;
        }
        ArrayList<Integer> Difference = new ArrayList<>();
        for (int i = 1; i < li.size(); i++) {
            Difference.add(li.get(i) - li.get(i-1));
        }
        int Min = Collections.min(Difference);
        return Min;
    }
}
