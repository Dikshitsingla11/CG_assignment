public class binarytodecimalviceversa {
    public static void main(String[] args) {
        String binaryString = "1011"; 
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal value: " + decimalValue);

        int decimalNumber = 11;
        String binaryValue = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary value: " + binaryValue);
    }
}
