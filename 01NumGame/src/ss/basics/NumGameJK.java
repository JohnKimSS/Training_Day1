// Java game that user has five tries to guess a number between 1-100 and must be within + or - 10 of the target number
// @author John Kim
package com.ss.basics.numgame;

import java.util.Scanner;

public class NumGameJK {
    
    public static void main(String[] args) {
        // Declaring variables
        int targetNum = (int)(Math.random() * 100  + 1);
        int guessNum;
        int count = 0;
        boolean correct = false;
        
        // Using Scanner util to accept user input to set as guessNum with each iteration
        Scanner input = new Scanner(System.in);
        
        while(!correct) {
            System.out.println("Guess a number between 1-100: ");
            
            // Setting guessNum as user input after system prompt
            guessNum = input.nextInt();
            
            //conditionals to check to see if user guess is within the range of +/- 10 of target number
            if(guessNum >= targetNum - 10 && guessNum <= targetNum + 10) {
                
                System.out.println("You are correct!");
                System.out.println("The precise number is "+targetNum);
                correct = true;
            
            } else {
                
                System.out.println("sorry, you have "+(4-count)+" tries remaining.");
                count++;
                
                // Nested conditional for exceeding five tries which will trigger an exit and reveal the answer
                if(count > 4) {
                    System.out.println("Game Over, the number was "+targetNum);
                    break;
                }
            }
        }
    }
}
