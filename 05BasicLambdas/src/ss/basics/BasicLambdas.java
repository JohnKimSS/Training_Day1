/**
 * 
 */
package com.ss.basics.lambdas;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jkim
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		String[] names = {"Joe", "John", "Alexander", "Jacob", "Katherine"};

		BasicLambdas obj = new BasicLambdas();
		obj.lengthAsc(names);
			System.out.println("---------------");
		obj.lengthDesc(names);
		System.out.println("---------------");
		obj.alpha(names);
	}
	
	public void lengthAsc(String[] arr) {
				
		Arrays.sort(arr, Comparator.comparingInt(String::length));
		for(String name: arr) {
			System.out.println("Names from shortest to longest: "+name);
		}
	}

	public void lengthDesc(String[] arr) {
			
		Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
		for(String name: arr) {
			System.out.println("Names from longest to shortest: "+name);
		}
	}
	
	public void alpha(String[] arr) {
		Arrays.sort(arr, (a, b) -> a.charAt(0) - b.charAt(0));
		for(String name: arr) {
			System.out.println("Names sorted by first letter: "+name);
		}
	}
}
