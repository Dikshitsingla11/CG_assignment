public class reverseeachword {
    public static void main(String[] args) {
        String str = "capgemini questions";
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }
}
