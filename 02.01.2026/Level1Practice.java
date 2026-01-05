import java.util.*;

import java.util.Scanner;

public class Level1Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call functions one by one (you can comment/uncomment as needed)

        divisibleByFive(sc);
        smallestOfThree(sc);
        largestOfThree(sc);
        naturalNumberSum(sc);
        votingCheck(sc);
        numberType(sc);
        springSeason(sc);
        countdownWhile(sc);
        countdownFor(sc);
        sumUntilZero(sc);
        sumUntilZeroOrNegative(sc);
        sumNaturalWhile(sc);
        sumNaturalFor(sc);
        factorialWhile(sc);
        factorialFor(sc);
    }

    // 1. Divisible by 5
    static void divisibleByFive(Scanner sc) {
        int n = sc.nextInt();
        System.out.println("Is the number " + n + " divisible by 5? " + (n % 5 == 0));
    }

    // 2. First number smallest
    static void smallestOfThree(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }

    // 3. Largest of three
    static void largestOfThree(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
    }

    // 4. Natural number & sum
    static void naturalNumberSum(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting check
    static void votingCheck(Scanner sc) {
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("The person's age is " + age + " and can vote.");
        else
            System.out.println("The person's age is " + age + " and cannot vote.");
    }

    // 6. Positive / Negative / Zero
    static void numberType(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) System.out.println("positive");
        else if (n < 0) System.out.println("negative");
        else System.out.println("zero");
    }

    // 7. Spring Season
    static void springSeason(Scanner sc) {
        int month = sc.nextInt();
        int day = sc.nextInt();

        if ((month == 3 && day >= 20) ||
            (month == 4 || month == 5) ||
            (month == 6 && day <= 20))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    // 8. Countdown using while
    static void countdownWhile(Scanner sc) {
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }

    // 9. Countdown using for
    static void countdownFor(Scanner sc) {
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // 10. Sum until user enters 0
    static void sumUntilZero(Scanner sc) {
        double total = 0;
        double n;
        while ((n = sc.nextDouble()) != 0) {
            total += n;
        }
        System.out.println(total);
    }

    // 11. Sum until 0 or negative
    static void sumUntilZeroOrNegative(Scanner sc) {
        double total = 0;
        while (true) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            total += n;
        }
        System.out.println(total);
    }

    // 12. Sum of n natural numbers using while
    static void sumNaturalWhile(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println(sum == formula);
        }
    }

    // 13. Sum of n natural numbers using for
    static void sumNaturalFor(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            int formula = n * (n + 1) / 2;
            System.out.println(sum == formula);
        }
    }

    // 14. Factorial using while
    static void factorialWhile(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            int fact = 1;
            while (n > 0) {
                fact *= n;
                n--;
            }
            System.out.println(fact);
        }
    }

    // 15. Factorial using for
    static void factorialFor(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println(fact);
        }
    }
}
