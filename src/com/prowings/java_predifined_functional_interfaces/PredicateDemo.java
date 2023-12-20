package com.prowings.java_predifined_functional_interfaces;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = n -> (n > 0);
		
		System.out.println("Result is : "+ p.test(-7));
		
		boolean res = p.test(20);
		
		System.out.println("Displaying result is : "+ res);
		
	}

}
