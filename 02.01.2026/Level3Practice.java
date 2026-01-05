import java.util.Scanner;

public class Level3Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        leapYearIfElse(sc);
        leapYearSingleIf(sc);
        marksAndGrade(sc);
        primeNumber(sc);
        armstrongNumber(sc);
        countDigits(sc);
        bmiCalculator(sc);
        harshadNumber(sc);
        abundantNumber(sc);
        calculator(sc);
        dayOfWeek(args);
    }

    // 1. Leap Year using multiple if-else
    static void leapYearIfElse(Scanner sc) {
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0)
                System.out.println("Leap Year");
            else if (year % 100 == 0)
                System.out.println("Not a Leap Year");
            else if (year % 4 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        } else {
            System.out.println("Year must be >= 1582");
        }
    }

    // 2. Leap Year using single if condition
    static void leapYearSingleIf(Scanner sc) {
        int year = sc.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    // 3. Marks, Percentage, Grade
    static void marksAndGrade(Scanner sc) {
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average: " + avg);

        if (avg >= 90)
            System.out.println("Grade A : Excellent");
        else if (avg >= 75)
            System.out.println("Grade B : Very Good");
        else if (avg >= 60)
            System.out.println("Grade C : Good");
        else if (avg >= 40)
            System.out.println("Grade D : Pass");
        else
            System.out.println("Grade F : Fail");
    }

    // 4. Prime Number
    static void primeNumber(Scanner sc) {
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
    }

    // 5. Armstrong Number
    static void armstrongNumber(Scanner sc) {
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }

    // 6. Count Digits
    static void countDigits(Scanner sc) {
        int number = sc.nextInt();
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }

    // 7. BMI Calculator
    static void bmiCalculator(Scanner sc) {
        double weight = sc.nextDouble(); // kg
        double heightCm = sc.nextDouble(); // cm

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }

    // 8. Harshad Number
    static void harshadNumber(Scanner sc) {
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }

    // 9. Abundant Number
    static void abundantNumber(Scanner sc) {
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum > number)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
    }

    // 10. Calculator using switch
    static void calculator(Scanner sc) {
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    // 11. Day Of Week (Command Line Arguments)
    static void dayOfWeek(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of week: " + d0);
    }
}
