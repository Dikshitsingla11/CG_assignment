public class maximumoccur {
    public static void main(String[] args) {
        String str="hello world";
        int[] freq=new int[256];

        char maxchar=' ';
        int max=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;

            if(freq[ch]>max){
                max=freq[ch];
                maxchar=ch;
            }
        }
        System.out.println(maxchar);
    }
}
