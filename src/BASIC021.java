import java.math.BigInteger;
import java.util.*;
public class BASIC021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Factorials of numbers from 1 to " + n + ":");

        BigInteger sumFactorial = BigInteger.ZERO;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
            sumFactorial = sumFactorial.add(factorial(i));
        }
        System.out.println("The sum of these factorials is: "+sumFactorial);

    }
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;

        for(int i = 1; i <= n; ++i){
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        return fact;
    }
}
