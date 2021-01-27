package com.ss.basics.wk1assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lambdas implements PerformOperation {
	
	public static void main(String[] args) {
		String str = args.toString();
		String[] arr = str.split("\n");
		
		Lambdas lam = new Lambdas();
		lam.handleInput(arr);
	}
	
	public static String handleInput(String[] arr) {
		for(String el: arr) {
			Integer input = Integer.parseInt(el);
				System.out.println(input);
			Integer action = Integer.parseInt(el);
			switch(input) {
			case 1: 
				return isOdd();
				break;
			case 2:
				return isPrime();
				break;
			case 3:
				return isPalindrome();
				break;
			default:
				return "invalid input(s)";
			}
		};
	}
	
	public static PerformOperation isOdd() {
		return num -> num % 2 == 0 ? "EVEN" : "ODD";
	}
	
	public static PerformOperation isPrime() {
		return num -> {
			if(num < 2) { // 0, 1 aren't prime
				return "1 or 0 NOT PRIME";
			} else if (num == 2) { // 2 is a prime number
				return "PRIME";
			} else if (num % 2) { // all even no aren't prime
				return "COMPOSITE";
			}
				IntStream.range(3, 9).forEach(i -> { // Loop through all other modulo
					if(num % i) {
						return "COMPOSITE";
					}
				});
			return "PRIME";
		};
	}
	
	public static PerformOperation isPalindrome() {
		return num -> {
			String orig = Integer.toString();
			String reverse = new StringBuilder(Integer.toString(num).reverse.toString());
			if(orig.equalTo(reverse)) {
				return "IS PALINDROME";
			} else {
				return "IS NOT PALINDROME";
			};
		};
	}
	

}
