import java.util.Scanner;

public class Level1StringPrograms {

    /* ---------- STRING COMPARISON USING charAt ---------- */
    static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    static void compareStrings(String s1, String s2) {
        boolean charAtResult = compareStringsCharAt(s1, s2);
        boolean equalsResult = s1.equals(s2);
        System.out.println("charAt Comparison: " + charAtResult);
        System.out.println("equals() Comparison: " + equalsResult);
        System.out.println("Results Same: " + (charAtResult == equalsResult));
    }

    /* ---------- SUBSTRING USING charAt ---------- */
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static void compareSubstrings(String text, int start, int end) {
        String customSub = substringUsingCharAt(text, start, end);
        String builtInSub = text.substring(start, end);
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Same Result: " +
                compareStringsCharAt(customSub, builtInSub));
    }

    /* ---------- RETURN CHAR ARRAY WITHOUT toCharArray ---------- */
    static char[] getChars(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    static void compareCharArrayResult(String text) {
        char[] custom = getChars(text);
        char[] builtIn = text.toCharArray();
        System.out.println("Char Arrays Same: " +
                compareCharArrays(custom, builtIn));
    }

    /* ---------- NULL POINTER EXCEPTION ---------- */
    static void generateNullPointer() {
        String text = null;
        text.length(); // Exception
    }

    static void handleNullPointer() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }
    }

    /* ---------- STRING INDEX OUT OF BOUNDS ---------- */
    static void generateStringIndexException(String text) {
        text.charAt(text.length());
    }

    static void handleStringIndexException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    /* ---------- ILLEGAL ARGUMENT EXCEPTION ---------- */
    static void generateIllegalArgument(String text) {
        text.substring(5, 2);
    }

    static void handleIllegalArgument(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Handled");
        }
    }

    /* ---------- NUMBER FORMAT EXCEPTION ---------- */
    static void generateNumberFormat(String text) {
        Integer.parseInt(text);
    }

    static void handleNumberFormat(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Handled");
        }
    }

    /* ---------- ARRAY INDEX OUT OF BOUNDS ---------- */
    static void generateArrayIndexException(String[] names) {
        System.out.println(names[names.length]);
    }

    static void handleArrayIndexException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Handled");
        }
    }

    /* ---------- TO UPPERCASE USING charAt ---------- */
    static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);
            result += ch;
        }
        return result;
    }

    static void compareUppercase(String text) {
        String custom = toUpperCaseCustom(text);
        String builtIn = text.toUpperCase();
        System.out.println("Uppercase Same: " +
                compareStringsCharAt(custom, builtIn));
    }

    /* ---------- TO LOWERCASE USING charAt ---------- */
    static String toLowerCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);
            result += ch;
        }
        return result;
    }

    static void compareLowercase(String text) {
        String custom = toLowerCaseCustom(text);
        String builtIn = text.toLowerCase();
        System.out.println("Lowercase Same: " +
                compareStringsCharAt(custom, builtIn));
    }

    /* ---------- MAIN ---------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        compareStrings(sc.next(), sc.next());

        compareSubstrings(sc.next(), sc.nextInt(), sc.nextInt());

        compareCharArrayResult(sc.next());

        try { generateNullPointer(); } catch (Exception ignored) {}
        handleNullPointer();

        String text = sc.next();
        try { generateStringIndexException(text); } catch (Exception ignored) {}
        handleStringIndexException(text);

        try { generateIllegalArgument(text); } catch (Exception ignored) {}
        handleIllegalArgument(text);

        String numberText = sc.next();
        try { generateNumberFormat(numberText); } catch (Exception ignored) {}
        handleNumberFormat(numberText);

        String[] names = new String[3];
        for (int i = 0; i < 3; i++) names[i] = sc.next();
        try { generateArrayIndexException(names); } catch (Exception ignored) {}
        handleArrayIndexException(names);

        sc.nextLine(); // buffer clear
        String lineText = sc.nextLine();
        compareUppercase(lineText);
        compareLowercase(lineText);

        sc.close();
    }
}
