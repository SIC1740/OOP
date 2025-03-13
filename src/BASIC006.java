import java.util.Scanner;

public class BASIC006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Loại bỏ dòng trống sau khi nhập số nguyên
        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
