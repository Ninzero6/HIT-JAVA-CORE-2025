package btvn;

public class Book {
    private static int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        bookId++;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public static int getBookId() {
        return bookId;
    }

    public static void setBookId(int bookId) {
        Book.bookId = bookId;
    }

    public void displayInfo(boolean showPublisher){
        if(showPublisher){
            System.out.println("BookId:"+bookId);
            System.out.println("Title:"+title);
            System.out.println("Author:"+author);
            System.out.println("Price:"+price);
            System.out.println("Publisher: "+publisher);
        }
        else {
            System.out.println("Publisher: Unknow");
        }

    }
}
