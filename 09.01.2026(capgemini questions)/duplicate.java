
import java.util.Scanner;

public class duplicate {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   ans[i]=arr[i];
                }
            }
        }   
        for(int i=0;i<n;i++){
            if(ans[i]!=0){
                System.out.print(ans[i]+" ");
            }
        }
    }
}
