import java.util.Scanner;

public class BASIC006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String  s1 = sc.nextLine();
            int cnt =0;
            for(char c : s1.toCharArray()){
                if(Character.isDigit(c))
                    cnt++;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}