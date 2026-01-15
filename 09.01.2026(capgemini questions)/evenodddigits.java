
import java.util.Scanner;

public class evenodddigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n=n/10;
        }
        System.out.println("Even digits: "+evencount);
        System.out.println("Odd digits: "+oddcount);
    }
}
