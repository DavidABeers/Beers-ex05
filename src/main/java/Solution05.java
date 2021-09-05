/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Beers
 */

/*
*   prompt user for first number
*   store the first number
*   prompt user for second number
*   store the second number
*   if numbers were fetched as strings, convert them to floats or integers.
*   calculate the product and store it
*   calculate the sum and store it
*   calculate the difference and store it
*   calculate the quotient and store it
*   print the result in one statement using a formatted print
*
*   It was not specified whether the number needed to be ints or floats, so I picked floats
*   and rounded to the second decimal.*/

import java.util.Scanner;
public class Solution05 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float firstNum = input.nextFloat();
        System.out.println("Enter the second number:");
        float secNum = input.nextFloat();
        float product = firstNum * secNum;
        float sum = firstNum + secNum;
        float difference = firstNum - secNum;
        float quotient = firstNum / secNum;

        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f",
                firstNum, secNum, sum, firstNum, secNum, difference, firstNum, secNum, product, firstNum, secNum, quotient);
    }
}
