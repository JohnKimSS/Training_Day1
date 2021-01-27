/**
 * 
 */
package com.ss.basics.lambdas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jkim
 *
 */
public class NumLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		NumLambdas obj = new NumLambdas();
		obj.evenOdd(nums);

	}
	
	public void evenOdd(ArrayList<Integer> arr) {
		arr.forEach(num -> {
			if(num % 2 == 0) {
				System.out.println("e"+num+",");
			} else {
				System.out.println("o"+num+",");
			}
		});
	}

}
