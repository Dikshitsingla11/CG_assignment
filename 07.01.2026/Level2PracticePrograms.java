import java.util.Scanner;

public class Level2PracticePrograms {

    /* ------------------ 1. FACTORS PROGRAM ------------------ */

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    static void printFactorResults(int[] factors) {
        int sum = 0;
        int product = 1;
        int sumOfSquares = 0;

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
            sum += f;
            product *= f;
            sumOfSquares += Math.pow(f, 2);
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Sum of Squares = " + sumOfSquares);
    }

    /* ------------------ 2. SUM OF N NATURAL NUMBERS ------------------ */

    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    static void compareSums(int n) {
        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);
        System.out.println("Recursive Sum = " + rSum);
        System.out.println("Formula Sum = " + fSum);
        System.out.println("Result Match = " + (rSum == fSum));
    }

    /* ------------------ 3. LEAP YEAR ------------------ */

    static void checkLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Invalid Year");
            return;
        }

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(leap ? "Leap Year" : "Not a Leap Year");
    }

    /* ------------------ 4. UNIT CONVERTOR ------------------ */

    static void unitConversions(double value) {
        System.out.println("Km to Miles = " + value * 0.621371);
        System.out.println("Miles to Km = " + value * 1.60934);
        System.out.println("Meters to Feet = " + value * 3.28084);
        System.out.println("Feet to Meters = " + value * 0.3048);
        System.out.println("Yards to Feet = " + value * 3);
        System.out.println("Feet to Yards = " + value * 0.333333);
        System.out.println("Meters to Inches = " + value * 39.3701);
        System.out.println("Inches to Meters = " + value * 0.0254);
        System.out.println("Inches to CM = " + value * 2.54);
        System.out.println("F to C = " + (value - 32) * 5 / 9);
        System.out.println("C to F = " + (value * 9 / 5 + 32));
        System.out.println("Pounds to Kg = " + value * 0.453592);
        System.out.println("Kg to Pounds = " + value * 2.20462);
        System.out.println("Gallons to Liters = " + value * 3.78541);
        System.out.println("Liters to Gallons = " + value * 0.264172);
    }

    /* ------------------ 5. STUDENT VOTING ------------------ */

    static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    static void checkVoting(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Student " + (i + 1) +
                    (canStudentVote(ages[i]) ? " Can Vote" : " Cannot Vote"));
        }
    }

    /* ------------------ 6. FRIENDS AGE & HEIGHT ------------------ */

    static void youngestFriend(int[] age) {
        int min = age[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < min) {
                min = age[i];
                index = i;
            }
        }
        System.out.println("Youngest Friend Index = " + index);
    }

    static void tallestFriend(double[] height) {
        double max = height[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > max) {
                max = height[i];
                index = i;
            }
        }
        System.out.println("Tallest Friend Index = " + index);
    }

    /* ------------------ 7. POSITIVE / EVEN / COMPARE ------------------ */

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    static void analyzeNumbers(int[] arr) {
        for (int n : arr) {
            if (!isPositive(n))
                System.out.println(n + " is Negative");
            else
                System.out.println(n + (isEven(n) ? " is Even" : " is Odd"));
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        System.out.println(result == 0 ? "Equal" : result == 1 ? "First Greater" : "Last Greater");
    }

    /* ------------------ 8. BMI PROGRAM ------------------ */

    static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
            System.out.println("BMI = " + data[i][2]);
        }
    }

    /* ------------------ 9. QUADRATIC ROOTS ------------------ */

    static void findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            System.out.println("Roots = " +
                    ((-b + Math.sqrt(delta)) / (2 * a)) + ", " +
                    ((-b - Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("Root = " + (-b / (2 * a)));
        } else {
            System.out.println("No Real Roots");
        }
    }

    /* ------------------ 10. RANDOM NUMBERS ------------------ */

    static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    static void findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int n : arr) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }
        System.out.println("Average = " + (sum / (double) arr.length));
        System.out.println("Min = " + min + ", Max = " + max);
    }

    /* ------------------ MAIN ------------------ */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printFactorResults(findFactors(n));

        int num = sc.nextInt();
        if (num > 0) compareSums(num);

        checkLeapYear(sc.nextInt());

        unitConversions(sc.nextDouble());

        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();
        checkVoting(ages);

        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextDouble();
        youngestFriend(age);
        tallestFriend(height);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        analyzeNumbers(arr);

        double[][] bmi = new double[10][3];
        for (int i = 0; i < 10; i++) {
            bmi[i][0] = sc.nextDouble();
            bmi[i][1] = sc.nextDouble();
        }
        calculateBMI(bmi);

        findRoots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        int[] randoms = generate4DigitRandomArray(5);
        findAverageMinMax(randoms);

        sc.close();
    }
}
