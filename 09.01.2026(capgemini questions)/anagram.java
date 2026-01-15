
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
       char[] ch1=str1.toCharArray();
       char[] ch2=str2.toCharArray();
       Arrays.sort(ch1);
        Arrays.sort(ch2);
         if(Arrays.equals(ch1,ch2)){
            System.out.println("anagram");  
         }
            else{
                System.out.println("not anagram");
            }
        }
    }