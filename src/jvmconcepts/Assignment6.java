/*Write a program to find greatest number in an array
* */

package jvmconcepts;

import java.util.Scanner;

public class Assignment6 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[6];
        System.out.println("Enter the values in an array:");
        for(int i=0;i<array1.length;i++){
            array1[i] = sc.nextInt();
        }

        int max = array1[0];
        for (int j=0;j<array1.length;j++){
            if(array1[j] > max){
                max = array1[j];
            }
        }
        System.out.println("The greatest value is "+max);


    }
}
