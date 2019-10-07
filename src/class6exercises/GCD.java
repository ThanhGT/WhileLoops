/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class6exercises;

import java.util.Scanner;

/**
 * Class 6-2 Exercise Problem 2
 * Objective: Determine the GCD of a value
 * Author: Thanh Tran
 * Date: 10.31.2018
 */
public class GCD {

    
    public static void main (String[] args) {
        // loop control
        int flag = 1; 
        // get input data
        Scanner input = new Scanner(System.in);
                
        //Loop
        while (flag == 1){

            System.out.println ("Please enter 2 values: \n");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            // Validate input data
            if (num1 > 0 && num2 > 0) {
            // compute GCD using method

                int commonDivisor = gCD (num1, num2);

                //Display the results
               // System.out.printf(null, args);
                System.out.printf ("GCD of %5d of %5d is %5d ", num1, num2, commonDivisor);
                
                } else {
                
                    System.out.println (" Input numbers should be greater than zero");
                }

            System.out.println("\nPlease type 1 to continue and zero to stop /n");
            flag = input.nextInt();
        }
    }
    
    // Method to compute GCD of two positvie integers
    public static int gCD (int n1, int n2){
        int gcd = 1;
        int k = 2;
        
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
                k++;
        }
        return gcd;
    }
}
