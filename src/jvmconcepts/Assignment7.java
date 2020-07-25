/*
Write a Java program to calculate the factorial of a number without using any loop.
 */

package jvmconcepts;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int num = sc.nextInt();

        System.out.println("The factorial of the number is: "+factorial(num));

    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
