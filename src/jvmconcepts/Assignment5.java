/*
* Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.)
* and print the sum of all the 4 digits.
* For ex : If the number passed is 3629, the program should print “The sum of all the digits entered is 20”
* */


package jvmconcepts;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number:");
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0){
            sum += number%10;
            number /= 10;
        }
        System.out.println("The sum of all the digits entered is "+sum);
    }
}
