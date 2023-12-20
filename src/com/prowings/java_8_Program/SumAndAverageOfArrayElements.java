package com.prowings.java_8_Program;

import java.util.Arrays;

public class SumAndAverageOfArrayElements {
	
	public static void main(String[] args) {
		
		int [] a = new int [] {45,12,56,15,24,75,31,89};
		
		int sum = Arrays.stream(a).sum();
		
		System.out.println("Sum = "+ sum);
		
		
		double average = Arrays.stream(a).average().getAsDouble();
		
		System.out.println("Average = "+ average);
	}

}
