package exceptionsString;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        sc.close();
        int halfLength = s.length()/2;
        for(int i=0;i<halfLength;i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                System.out.println(s+" is not a palindrome");
                break;
            }else {
                if(i==halfLength-1)
                    System.out.println(s+" is a palindrome");
            }
        }


    }
}
