public class repeats {

    public static String repeatst(String s,int b){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<b;i++){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int b=3;
        String a="abc";
        System.out.println(repeatst(a,b));
    }
}
