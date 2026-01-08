import java.util.Scanner;

public class Level2StringPrograms {

    /* ---------------- 1. STRING LENGTH WITHOUT length() ---------------- */

    static int findLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static void compareLength(String text) {
        int custom = findLengthWithoutLength(text);
        int builtIn = text.length();
        System.out.println("Custom Length = " + custom);
        System.out.println("Built-in Length = " + builtIn);
    }

    /* ---------------- COMMON WORD SPLIT METHOD ---------------- */

    static String[] splitWordsCharAt(String text) {
        int words = 1;
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') words++;
            } catch (Exception e) {
                break;
            }
        }

        int[] spaceIndex = new int[words + 1];
        int idx = 1;
        spaceIndex[0] = -1;

        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndex[idx++] = i;
                }
            } catch (Exception e) {
                spaceIndex[idx] = i;
                break;
            }
        }

        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            result[i] = word;
        }
        return result;
    }

    static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    static void compareSplit(String text) {
        String[] custom = splitWordsCharAt(text);
        String[] builtIn = text.split(" ");
        System.out.println("Split Same: " + compareStringArrays(custom, builtIn));
    }

    /* ---------------- WORD + LENGTH 2D ARRAY ---------------- */

    static String[][] wordsWithLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLengthWithoutLength(words[i]));
        }
        return data;
    }

    static void displayWordLengthTable(String[][] data) {
        System.out.println("WORD\tLENGTH");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    static int[] shortestAndLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = min;
        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    /* ---------------- VOWEL / CONSONANT ---------------- */

    static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32);
        if (ch < 'a' || ch > 'z') return "Not a Letter";
        if ("aeiou".indexOf(ch) >= 0) return "Vowel";
        return "Consonant";
    }

    static int[] countVowelsConsonants(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < findLengthWithoutLength(text); i++) {
            String type = checkCharType(text.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    static String[][] vowelConsonantTable(String text) {
        int len = findLengthWithoutLength(text);
        String[][] table = new String[len][2];
        for (int i = 0; i < len; i++) {
            table[i][0] = String.valueOf(text.charAt(i));
            table[i][1] = checkCharType(text.charAt(i));
        }
        return table;
    }

    static void display2DTable(String[][] table) {
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    /* ---------------- TRIM STRING ---------------- */

    static int[] trimIndexes(String text) {
        int start = 0, end = findLengthWithoutLength(text) - 1;
        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    static String substringCharAt(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++) res += text.charAt(i);
        return res;
    }

    static boolean compareStrings(String a, String b) {
        if (findLengthWithoutLength(a) != findLengthWithoutLength(b)) return false;
        for (int i = 0; i < findLengthWithoutLength(a); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    static void compareTrim(String text) {
        int[] idx = trimIndexes(text);
        String custom = substringCharAt(text, idx[0], idx[1]);
        String builtIn = text.trim();
        System.out.println("Trim Same: " + compareStrings(custom, builtIn));
    }

    /* ---------------- VOTING ---------------- */

    static int[] generateAges(int n) {
        int[] age = new int[n];
        for (int i = 0; i < n; i++)
            age[i] = (int) (Math.random() * 90);
        return age;
    }

    static String[][] votingTable(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return data;
    }

    /* ---------------- ROCK PAPER SCISSORS ---------------- */

    static String computerChoice() {
        int r = (int) (Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "User";
        return "Computer";
    }

    /* ---------------- MARKS & GRADE ---------------- */

    static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = (int) (Math.random() * 50 + 50);
        return pcm;
    }

    static String grade(double p) {
        if (p >= 90) return "A";
        if (p >= 75) return "B";
        if (p >= 60) return "C";
        return "D";
    }

    static void displayScorecard(int[][] pcm) {
        System.out.println("P\tC\tM\tTOTAL\tAVG\tPERCENT\tGRADE");
        for (int[] s : pcm) {
            int total = s[0] + s[1] + s[2];
            double avg = Math.round((total / 3.0) * 100) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100) / 100.0;
            System.out.println(s[0] + "\t" + s[1] + "\t" + s[2] + "\t" +
                    total + "\t" + avg + "\t" + percent + "\t" + grade(percent));
        }
    }

    /* ---------------- MAIN ---------------- */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        compareLength(sc.next());

        sc.nextLine();
        String text = sc.nextLine();
        compareSplit(text);

        String[][] wordLen = wordsWithLength(splitWordsCharAt(text));
        displayWordLengthTable(wordLen);

        int[] sl = shortestAndLongest(wordLen);
        System.out.println("Shortest Length = " + sl[0]);
        System.out.println("Longest Length = " + sl[1]);

        int[] vc = countVowelsConsonants(text);
        System.out.println("Vowels = " + vc[0] + ", Consonants = " + vc[1]);

        display2DTable(vowelConsonantTable(text));

        compareTrim(text);

        display2DTable(votingTable(generateAges(10)));

        int[][] pcm = generatePCM(5);
        displayScorecard(pcm);

        sc.close();
    }
}
