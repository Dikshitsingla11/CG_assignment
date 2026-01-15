
import java.util.Scanner;

public class rotatearrayleftright {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt(); //number of rotations
        k=k%n; //in case k>n
        //left rotation
        for(int i=k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //right rotation



        for(int i=n-k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

    }
}
