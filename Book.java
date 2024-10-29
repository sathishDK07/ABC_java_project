public class Book {
    public String title;
    public String author;
    public double price;
    private static int bookCount = 0;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    public static void main(String[] args) {
        Book book1 = new Book("2011", "MSD", 105.99);
        Book book2 = new Book("1983", "kapil dev", 102.99);

        book1.displayInfo();
        book2.displayInfo();

        Book.displayBookCount();
    }
}
