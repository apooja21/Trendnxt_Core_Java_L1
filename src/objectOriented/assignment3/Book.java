package objectOriented.assignment3;

public class Book {

    public int isbn;
    public String title;
    public double price;

    public Book(int isbn, String title, double price){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
    public static void main(String[] args) {

        Magazine magazine = new Magazine("ISBN123", "Computers Today", 400, "Technology");
        Novel novel = new Novel("ISBN456", "Ponniyin Selvan", 500, "John Doe");
        System.out.println(magazine+"\n"+novel);

    }

}
