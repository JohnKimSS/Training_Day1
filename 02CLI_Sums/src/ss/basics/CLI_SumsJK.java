/*
@Author John Kim
Simple CLI integer sum with exception handling
*/

package com.ss.basics.clisums;

public class CLI_SumsJK {
    
    public static void main(String[] args) {
        int numSum = 0;
        if(args.length > 0) {
        // Sum numbers then add in exception handling in try catch block
        for(int i=0; i < args.length; i++) {
            try{
            numSum += Integer.parseInt(args[i]);
            } catch (NumberFormatException err) {
                System.out.print("invalid arguements "+err);
            }
        }
        System.out.println("Sum = "+numSum);
    } else {
        System.err.print("No arguments found");
    }
    }

}
