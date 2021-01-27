/**
 * 
 */
package com.ss.basics.wk1assign;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jkim
 *
 */
public class Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12, 24, 36, 45, 531, 613, 121));
		Functional fcn = new Functional();
		// Printing out results of Q.2
		System.out.println(fcn.rightDigit(nums));
		// Printing out results of Q.3
		System.out.println(fcn.doubling(nums));
		// Printing out results of Q.4
		ArrayList<String> xStr = new ArrayList<>(Arrays.asList("ax", "bb", "cx", "xxax", "xbxax"));
		System.out.println(fcn.noX(xStr));
	}
	
	public ArrayList<Integer> rightDigit(ArrayList<Integer> arr) {
		ArrayList<Integer> rightNums = new ArrayList<>();
		arr.forEach(el -> {
			rightNums.add(el % 10);
		});
		return rightNums;
	}
	
	public ArrayList<Integer> doubling(ArrayList<Integer> arr) {
		ArrayList<Integer> doubledNums = new ArrayList<>();
		arr.forEach(el -> {
			doubledNums.add(el * 2);
		});
		return doubledNums;
	}
	
	public ArrayList<String> noX(ArrayList<String> arr) {
		ArrayList<String> noEx = new ArrayList<>();
		arr.forEach(el -> {
			String modEl = "";
			for(int i=0; i<el.length(); i++) {
				if(el.charAt(i) == 'x') {
				} else {
					modEl += el.charAt(i);
				}
			}
			noEx.add(modEl);
		});
		return noEx;
	}
	
//	public static boolean groupSumClump() {
//		
//	}

}
