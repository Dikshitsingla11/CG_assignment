class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    String fileSize;

    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        System.out.println("ISBN: " + ISBN);     // public
        System.out.println("Title: " + title);   // protected
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("File Size: " + fileSize);
    }
}

public class BookMain {
    public static void main(String[] args) {
        EBook eb = new EBook("978-12345", "Java Basics", "James", "5MB");
        eb.displayEBook();

        eb.setAuthor("New Author");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
