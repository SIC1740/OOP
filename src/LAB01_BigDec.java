import java.math.BigDecimal;
import java.util.Scanner;
import java.util.*;
public class LAB01_BigDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();

            String[] nums= s.split("\\s+");
            BigDecimal sum = BigDecimal.ZERO;
            for(String num : nums){
                BigDecimal bigdecimal = new BigDecimal(num);

                BigDecimal fraction = bigdecimal.remainder(BigDecimal.ONE);
                sum = sum.add(fraction);
            }
            if(sum.compareTo(BigDecimal.ZERO) == 0){
                System.out.println(0);
            }
            else{
                System.out.println(sum);
            }

        }
        sc.close();
    }
}
//Big Decimal