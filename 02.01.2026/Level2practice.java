import java.util.Scanner;

public class Level2Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        oddEven(sc);
        employeeBonus(sc);
        multiplicationTable(sc);
        fizzBuzzFor(sc);
        fizzBuzzWhile(sc);
        youngestAndTallest(sc);
        factorsFor(sc);
        factorsWhile(sc);
        greatestFactorFor(sc);
        greatestFactorWhile(sc);
        multiplesBelow100For(sc);
        powerFor(sc);
        multiplesBelow100While(sc);
        powerWhile(sc);
    }

    // 1. Odd and Even numbers
    static void oddEven(Scanner sc) {
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        }
    }

    // 2. Employee bonus
    static void employeeBonus(Scanner sc) {
        double salary = sc.nextDouble();
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }

    // 3. Multiplication table from 6 to 9
    static void multiplicationTable(Scanner sc) {
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // 4. FizzBuzz using for loop
    static void fizzBuzzFor(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }

    // 5. FizzBuzz using while loop
    static void fizzBuzzWhile(Scanner sc) {
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }

    // 6. Youngest and Tallest friend
    static void youngestAndTallest(Scanner sc) {
        int ageA = sc.nextInt(), ageB = sc.nextInt(), ageC = sc.nextInt();
        int heightA = sc.nextInt(), heightB = sc.nextInt(), heightC = sc.nextInt();

        int youngestAge = Math.min(ageA, Math.min(ageB, ageC));
        int tallestHeight = Math.max(heightA, Math.max(heightB, heightC));

        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }

    // 7. Factors using for loop
    static void factorsFor(Scanner sc) {
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }

    // 8. Factors using while loop
    static void factorsWhile(Scanner sc) {
        int number = sc.nextInt();
        int i = 1;
        while (i < number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }

    // 9. Greatest factor using for loop
    static void greatestFactorFor(Scanner sc) {
        int number = sc.nextInt();
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
    }

    // 10. Greatest factor using while loop
    static void greatestFactorWhile(Scanner sc) {
        int number = sc.nextInt();
        int counter = number - 1;
        int greatestFactor = 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor);
    }

    // 11. Multiples below 100 using for loop
    static void multiplesBelow100For(Scanner sc) {
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }
        }
    }

    // 12. Power using for loop
    static void powerFor(Scanner sc) {
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    // 13. Multiples below 100 using while loop
    static void multiplesBelow100While(Scanner sc) {
        int number = sc.nextInt();
        int counter = 100;

        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }

    // 14. Power using while loop
    static void powerWhile(Scanner sc) {
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(result);
    }
}
