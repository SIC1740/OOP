import java.math.BigInteger;
import java.util.Scanner;

public class LAB01_BigInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();

            String[] inpart = s.split(" ");

            BigInteger a1 = new BigInteger(inpart[0]);
            BigInteger a2 = new BigInteger(inpart[2]);

            String operator = inpart[1];

            switch (operator) {
                case "+":
                    a1 = a1.add(a2);
                    break;
                case "-":
                    a1 = a1.subtract(a2);
                    break;
                case "*":
                    a1 = a1.multiply(a2);
                    break;
            }
            System.out.println(a1);
        }
        sc.close();
    }
}
//Big Integer