package objectOriented.assignment3;

public class Novel extends Book{

    private String author;

    public Novel(String isbn, String title, int price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Novel [author=" + author + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
    }

    //String
}
