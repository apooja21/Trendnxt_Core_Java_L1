/*
* Write a Java program to convert minutes into a number of years and days
* */

package jvmconcepts;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the minutes");
        long minutes = sc.nextLong();

        int year = (int)(minutes / 525600);
        int remainingMinutes = (int)(minutes % 525600);
        int day = remainingMinutes / 1440;

        System.out.println("minutes "+minutes+"is equal to "+year+" year and "+day+" days");

    }
}
