public class removevowels {
    public static void main(String[] args) {
        String str="capgemini questions";
        String result=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(result);
    }
}
