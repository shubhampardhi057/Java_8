package com.prowings.java_predifined_functional_interfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> f = s -> s.length();
		
		System.out.println("Length of String is : "+ f.apply("Ram"));
		
	}
}
