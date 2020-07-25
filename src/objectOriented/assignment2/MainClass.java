package objectOriented.assignment2;

public class MainClass {

    public static void main(String[] args) {

        String sample1 = "This is Trendnxt Java L1 assignment";

        String sample2 = "This assignment comprises of the basic concepts of java";

        Document email1 = new Email(sample1, "Peter", "Martin", "Assignment");
        Document email2 = new Email(sample2, "Josh", "Lucky", "Java");

        System.out.println(email1.toString());
        System.out.println("---------");
        System.out.println(email2.toString());

    }
}
