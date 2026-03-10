public class removeduplicate {
    public static void main(String[] args) {
        String str="CsharpstarZ";
        StringBuilder sb=new StringBuilder();

        int freq[]= new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
         for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(freq[ch] > 0){
                sb.append(ch);
                freq[ch] = 0; 
            }
        }
        System.out.println(sb.toString());

    }
}
