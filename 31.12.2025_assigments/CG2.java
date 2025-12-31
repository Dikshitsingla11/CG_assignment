import java.util.*;

//level 2 practice assignment
public class CG2 {
    public static void main(String[] args) {
        // quotientAndRemainder();
        // intOperations();
        // doubleOperations();
        // celsiusToFahrenheit();
        // fahrenheitToCelsius();      
        // totalIncome();
        // swapNumbers();
        // travelDetails();
        // athleteRounds();
        // chocolatesDistribution();
        // simpleInterest();
        poundsToKg();
    }

        // 1. Quotient and Remainder
    static void quotientAndRemainder() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 + " and " + number2
        );
    }

    // 2. Int Operations
    static void intOperations() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;

        System.out.println(
            "The results of Int Operations are " +
            r1 + ", " + r2 + ", " + r3 + ", and " + r4
        );
    }

    // 3. Double Operations
    static void doubleOperations() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;

        System.out.println(
            "The results of Double Operations are " +
            r1 + ", " + r2 + ", " + r3 + ", and " + r4
        );
    }

     // 4. Celsius to Fahrenheit
    static void celsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(
            "The " + celsius + " celsius is " + fahrenheit + " fahrenheit"
        );
    }

    // 5. Fahrenheit to Celsius
    static void fahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(
            "The " + fahrenheit + " fahrenheit is " + celsius + " celsius"
        );
    }
      // 6. Total Income
    static void totalIncome() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        double income = salary + bonus;

        System.out.println(
            "The salary is INR " + salary +
            " and bonus is INR " + bonus +
            ". Hence Total Income is INR " + income
        );
    }

    // 7. Swap two numbers
    static void swapNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(
            "The swapped numbers are " + number1 + " and " + number2
        );
    }

    // 8. Travel Details (Sample Program rewrite)
    static void travelDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter from city: ");
        String fromCity = sc.next();
        System.out.print("Enter via city: ");
        String viaCity = sc.next();
        System.out.print("Enter to city: ");
        String toCity = sc.next();

        System.out.print("Enter distance from-to-via (miles): ");
        double d1 = sc.nextDouble();
        System.out.print("Enter distance via-to-final (miles): ");
        double d2 = sc.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        double totalDistance = d1 + d2;
        double speed = totalDistance / time;

        System.out.println(
            name + " travelled from " + fromCity + " via " + viaCity +
            " to " + toCity +
            ". Total Distance: " + totalDistance +
            " miles and Average Speed: " + speed
        );
    }

    // 9. Athlete Rounds
    static void athleteRounds() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double perimeter = s1 + s2 + s3;
        double rounds = 5000 / perimeter;

        System.out.println(
            "The total number of rounds the athlete will run is " + rounds + " to complete 5 km"
        );
    }

    // 10. Chocolates Distribution
    static void chocolatesDistribution() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        System.out.println(
            "The number of chocolates each child gets is " + (chocolates / children) +
            " and the number of remaining chocolates are " + (chocolates % children)
        );
    }

    // 11. Simple Interest
    static void simpleInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println(
            "The Simple Interest is " + si +
            " for Principal " + principal +
            ", Rate of Interest " + rate +
            " and Time " + time
        );
    }

    // 12. Pounds to Kilograms
    static void poundsToKg() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        double kg = pounds / 2.2;

        System.out.println(
            "The weight of the person in pound is " + pounds +
            " and in kg is " + kg
        );
    }
}
