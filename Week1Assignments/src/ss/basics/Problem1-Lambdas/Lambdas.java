package com.ss.basics.wk1assign;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambdas implements PerformOperation {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 121));
		Lambdas obj = new Lambdas();
		//System.out.println(obj.isOdd(nums));
	}
	
	public static PerformOperation isOdd() {
		return num -> num % 2 == 0 ? "even" : "odd";
	}
	
	public static PerformOperation isPrime() {
		return num -> {
			if(num < 2) { // 0, 1 aren't prime
				return false;
			} else if (num == 2) { // 2 is a prime number
				return true;
			} else if (num % 2) { // all even no aren't prime
				return false;
			}
				IntStream.range(3, 9).forEach(i -> { // Loop through all other modulo
					if(num % i) {
						return false;
					}
				});
			return true;
		};
	}
	
	public static PerformOperation isPalindrome() {
		return num -> {
			String orig = Integer.toString();
			String reverse = new StringBuilder(Integer.toString(num).reverse.toString());
			return orig.equalTo(reverse);
		};
	}
	

}
