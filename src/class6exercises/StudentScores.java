/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6exercises;

import java.util.Scanner;

/**
 * Class 6-2 Exercise Problem 1
 * Counts the number of students and computes the scores and average of all scores
 * Author: Thanh Tran
 * Date: October 10, 2018
 */

public class StudentScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            double score = 0;   // declares variable score
            int count = 0;      //declares variable count
            double sum = 0;     // declares a variable for sum
            double avgSum;     // declares a variable for average sum
            
            while (score != -1) { 
                Scanner input = new Scanner (System.in);
                System.out.println ("Please enter a score");
                score = input.nextDouble ();
                // compute the number of students
                sum = sum + score;
                count ++;
            }   
                
                // compute the average
                avgSum = sum / (count-1);
                
                
                // outputs to the user
                System.out.printf ("The total number of scores is %d \n", (count - 1));
                System.out.printf ("The sum of scores is %f \n", sum);
                System.out.printf ("The average score is %f", avgSum);
                           
            }
    }
