package com.prowings.java_predifined_functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> new Random().nextInt();
		
		System.out.println("Random number from system is : "+s.get());
	}

}
