import java.util.Scanner;

public class Level1PracticePrograms {

    // 1. Simple Interest
    static void calculateSimpleInterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + si +
                " for Principal " + p +
                ", Rate of Interest " + r +
                " and Time " + t);
    }

    // 2. Maximum Handshakes
    static void calculateHandshakes(int n) {
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes = " + handshakes);
    }

    // 3. Rounds in triangular park
    static void calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        System.out.println("Number of rounds to complete 5 km = " + rounds);
    }

    // 4. Positive, Negative or Zero
    static void checkNumber(int n) {
        if (n > 0)
            System.out.println("Number is Positive");
        else if (n < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }

    // 5. Spring Season
    static void checkSpringSeason(int month, int day) {
        boolean isSpring =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        if (isSpring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    // 6. Sum of natural numbers
    static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers = " + sum);
    }

    // 7. Smallest and Largest of 3 numbers
    static void findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

    // 8. Quotient and Remainder
    static void findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    // 9. Chocolates distribution
    static void distributeChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        System.out.println("Each child gets = " + each);
        System.out.println("Remaining chocolates = " + remaining);
    }

    // 10. Wind Chill
    static void calculateWindChill(double temp, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temp +
                (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("Wind Chill Temperature = " + windChill);
    }

    // 11. Trigonometric functions
    static void calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        System.out.println("Sin = " + Math.sin(radians));
        System.out.println("Cos = " + Math.cos(radians));
        System.out.println("Tan = " + Math.tan(radians));
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal, Rate and Time: ");
        calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("\nEnter number of students: ");
        calculateHandshakes(sc.nextInt());

        System.out.print("\nEnter sides of triangle: ");
        calculateRounds(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("\nEnter a number: ");
        checkNumber(sc.nextInt());

        System.out.print("\nEnter month and day: ");
        checkSpringSeason(sc.nextInt(), sc.nextInt());

        System.out.print("\nEnter n: ");
        sumOfNaturalNumbers(sc.nextInt());

        System.out.print("\nEnter 3 numbers: ");
        findSmallestAndLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("\nEnter number and divisor: ");
        findRemainderAndQuotient(sc.nextInt(), sc.nextInt());

        System.out.print("\nEnter chocolates and children: ");
        distributeChocolates(sc.nextInt(), sc.nextInt());

        System.out.print("\nEnter temperature and wind speed: ");
        calculateWindChill(sc.nextDouble(), sc.nextDouble());

        System.out.print("\nEnter angle in degrees: ");
        calculateTrigonometricFunctions(sc.nextDouble());

        sc.close();
    }
}
