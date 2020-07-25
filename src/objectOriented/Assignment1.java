/*Write a program to create a class Book with the following
- attributes: -isbn, title, author, price
- methods :
i. Initialize the data members through parameterized constructor
ii. displaydetails() to display the details of the book
iii. discountedprice() : pass the discount percent, calculate the discount on price and find
the amount to be paid after discount
- task :
Create an object book, initialize the book and display the details along with the discounted
price

 */
package objectOriented;

public class Assignment1 {

    public int isbn;
    public String title;
    public String author;
    public double price;

    Assignment1(int isbn, String title, String author, double price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public double discountPrice(double discount){
        double discountvalue = (discount/100) * price;
        double discountedprice = price - discountvalue;
        return discountedprice;
    }

    public void displayDetails(){
        System.out.println("The isbn of the book: "+isbn);
        System.out.println("The isbn of the title: "+title);
        System.out.println("The isbn of the author: "+author);
        System.out.println("The isbn of the price: "+price);
    }


    public static void main(String[] args) {
        Assignment1 book = new Assignment1(115135,"jcddcc","dcbjdbejhdcbje",5624);
        book.displayDetails();
        System.out.println("Price After Discount: "+book.discountPrice(20));

    }
}
