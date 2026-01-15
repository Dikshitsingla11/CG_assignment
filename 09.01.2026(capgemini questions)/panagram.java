public class panagram {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over a lazy dog";
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int index = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                index = ch - 'a';
                alphabet[index] = true;
            }

        }
        boolean isPanagram = true;
        for(int i=0;i<26;i++){
            if(!alphabet[i]){
                isPanagram = false;
                break;
            }
        }
        System.out.println(isPanagram ? "The string is a pangram." : "The string is not a pangram.");
    }
}
