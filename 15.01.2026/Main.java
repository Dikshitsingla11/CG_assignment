class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Circle {
    double radius;

    void displayAreaAndCircumference() {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    void calculateTotalCost(int quantity) {
        System.out.println("Total Cost: " + (price * quantity));
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("---- Employee Details ----");
        Employee e = new Employee();
        e.name = "Rahul";
        e.id = 101;
        e.salary = 50000;
        e.displayDetails();

        System.out.println("\n---- Circle Details ----");
        Circle c = new Circle();
        c.radius = 7;
        c.displayAreaAndCircumference();

        System.out.println("\n---- Book Details ----");
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 450;
        b.displayDetails();

        System.out.println("\n---- Item Details ----");
        Item i = new Item();
        i.itemCode = 501;
        i.itemName = "Pen";
        i.price = 10;
        i.displayItemDetails();
        i.calculateTotalCost(5);

        System.out.println("\n---- Mobile Phone Details ----");
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "Galaxy S23";
        m.price = 75000;
        m.displayDetails();
    }
}
