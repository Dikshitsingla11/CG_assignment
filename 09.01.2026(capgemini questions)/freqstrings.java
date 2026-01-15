public class freqstrings {
    public static void main(String[] args) {
        String str="capgemini questions capgemini";
        String words[]=str.split(" ");
        int freq[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            freq[i]=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    freq[i]++;
                    words[j]="0";
                }
            }
        }
        for(int i=0;i<words.length;i++){
            if(words[i]!="0"){
                System.out.println(words[i]+"-"+freq[i]);
            }
        }

    }
}
