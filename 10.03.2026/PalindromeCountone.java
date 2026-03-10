public class PalindromeCountone {
    public static void main(String[] args) {
        String str="this is level 171";

        String[] words=str.split(" ");
        int count=0;

        for(int i=0;i<words.length;i++){
            String word=words[i];
            int left=0;
            int right=word.length()-1;
            boolean isPalindrome=true;

            while(left<right){
                if(word.charAt(left)!=word.charAt(right)){
                    isPalindrome=false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome){
                count++;
            }
        }
        System.out.println(count);

    }
}
