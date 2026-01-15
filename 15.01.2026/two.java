// 1️⃣ Student Report
class Student {
    String name;
    int rollNumber;
    int marks;
    char grade;

    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'D';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// 2️⃣ ATM Simulation
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// 3️⃣ Palindrome Checker
class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}

// 4️⃣ Movie Ticket Booking
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket Booked Successfully");
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

// 5️⃣ Shopping Cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
        else
            System.out.println("Not enough items to remove");
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: " + (price * quantity));
    }
}

// MAIN CLASS
public class two {
    public static void main(String[] args) {

        System.out.println("---- Student Report ----");
        Student s = new Student();
        s.name = "Amit";
        s.rollNumber = 12;
        s.marks = 82;
        s.calculateGrade();
        s.displayDetails();

        System.out.println("\n---- ATM Simulation ----");
        BankAccount b = new BankAccount();
        b.accountHolder = "Rohit";
        b.accountNumber = 12345;
        b.balance = 5000;
        b.deposit(2000);
        b.withdraw(3000);
        b.displayBalance();

        System.out.println("\n---- Palindrome Checker ----");
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";
        p.displayResult();

        System.out.println("\n---- Movie Ticket Booking ----");
        MovieTicket m = new MovieTicket();
        m.movieName = "Inception";
        m.bookTicket(15, 250);
        m.displayTicket();

        System.out.println("\n---- Shopping Cart ----");
        CartItem c = new CartItem();
        c.itemName = "Notebook";
        c.price = 50;
        c.addItem(5);
        c.removeItem(2);
        c.displayTotalCost();
    }
}
