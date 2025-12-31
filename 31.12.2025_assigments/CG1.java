import java.util.*;

//level 1 practice assignment
public class CG1 {
   

    public static void main(String[] args) {

        // findHarryAge();
        // findSamAverage();
        // convertKmToMiles();
        // profitandloss();
        // dividePens();
        // universityDiscount();
        // earthVolume();
        // kmToMiles();
        // universityDiscountUserInput();
        // heightConversion();
        // basicCalculator();
        // triangleArea(); 
        // squareSide();
        // feetToYardsMiles();
        // totalPurchasePrice();
        handshakes();
    }

    // Question 1: Find Harry's age
    static void findHarryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }

    // Question 2: Find Sam's average PCM marks
    static void findSamAverage() {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }

    // Question 3: Convert km to miles
    static void convertKmToMiles() {
        double km = 10.8;
        double miles = km * 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // Question 4: profit and loss
    static void profitandloss() {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println(
            "The Cost Price is INR " + costPrice +
            " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit +
            " and the Profit Percentage is " + profitPercent
        );       
}
    
       // 5. Divide pens
    static void dividePens() {
        int pens = 14;
        int students = 3;
        System.out.println(
            "The Pen Per Student is " + (pens / students) +
            " and the remaining pen not distributed is " + (pens % students)
        );
    }
    //6.University discount
    static void universityDiscount() {
        int fee=125000;
        int discountPercent=10;
        double discountAmount=(fee*discountPercent)/100.0;
        double finalFee=fee-discountAmount;
        System.out.println("The original fee is INR "+fee+
                           "\nThe discount amount is INR "+discountAmount+
                           "\nThe final fee after discount is INR "+finalFee);

}
//7.volume of earth
   static void earthVolume() {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }

    //8km to miles
    static void kmToMiles() {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 1.6;

        System.out.println("Total miles is " + miles+"mile for given km "+km+"km");
}

     // 9. University discount
    static void universityDiscountUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();

        double discount = fee * discountPercent / 100;
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + (fee - discount)
        );
    }

    //10.height conversion
     static void heightConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;

        System.out.println(
            "Your Height in cm is " + cm +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }

     // 11. Basic calculator
    static void basicCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double a = sc.nextDouble();
        System.out.print("Enter number2: ");
        double b = sc.nextDouble();

        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " +
            a + " and " + b + " is " +
            (a + b) + ", " +
            (a - b) + ", " +
            (a * b) + ", " +
            (a / b)
        );
    }

    // 12. Area of triangle
    static void triangleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
    }

    // 13. Side of square
    static void squareSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        System.out.println(
            "The length of the side is " + (perimeter / 4) +
            " whose perimeter is " + perimeter
        );
    }

    // 14. Feet to yards and miles
    static void feetToYardsMiles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println(
            "Distance in yards is " + yards +
            " and miles is " + miles
        );
    }

    // 15. Total purchase price
    static void totalPurchasePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.println(
            "The total purchase price is INR " + (unitPrice * quantity) +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );
    }

    // 16. Handshakes
    static void handshakes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}
