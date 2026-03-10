public class anagrams {
    public static void main(String[] args) {
        String str="silent";
        String two="iterat";
        int flag=1;

        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<two.length();i++){
            char ch=two.charAt(i);
            if(freq[ch]==0){
                flag=0;
                break;
            }
        }
        if(flag==0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
