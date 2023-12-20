package com.prowings.java_predifined_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> c = n -> System.out.println("Given value is : "+ n);
		
		c.accept(30);
		
	}
	
}
