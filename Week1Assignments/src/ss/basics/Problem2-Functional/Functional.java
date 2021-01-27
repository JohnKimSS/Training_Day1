/**
 * 
 */
package com.ss.basics.wk1assign;

import java.util.ArrayList;

/**
 * @author jkim
 *
 */
public class Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Integer> rightDigit(ArrayList<Integer> arr) {
		ArrayList<Integer> rightNums = new ArrayList<>();
		arr.forEach(el -> {
			rightNums.add(el % 10);
		});
		return rightNums;
	}
	
	public static ArrayList<Integer> doubling(ArrayList<Integer> arr) {
		ArrayList<Integer> doubledNums = new ArrayList<>();
		arr.forEach(el -> {
			doubledNums.add(el * 2);
		});
		return doubledNums;
	}
	
	public static ArrayList<String> noX(ArrayList<String> arr) {
		ArrayList<String> noEx = new ArrayList<>();
		arr.forEach(el -> {
			String modEl;
			for(char c : el) {
				if(c == 'x') {
				} else {
					modEl += c;
				}
			}
			noEx.add(modEl);
		});
		return noEx;
	}
	
	public static boolean groupSumClump() {
		
	}

}
