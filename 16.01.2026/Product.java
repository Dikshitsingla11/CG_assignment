public class Product {
    String productName;
    int price;

    static int totalproducts = 0;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalproducts++;
    }

    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static int totalproducts() {
        return totalproducts;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        p1.display();
        p2.display();

        System.out.println("Total Products: " + Product.totalproducts());
    }
}
