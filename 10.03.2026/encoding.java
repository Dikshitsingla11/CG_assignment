public class encoding {
    public static void main(String[] args) {
        String str="101101110";
        int count=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
            else{
                char ch=(char)('A'+count-1);
                sb.append(ch);
                count=0;
            }
        }
        System.out.println(sb.toString());
    }
}
