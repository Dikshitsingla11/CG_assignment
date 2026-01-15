import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

       
        int b = sc.nextInt();

        int x = a, y = b;

        
        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD (HCF) = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
