package com.prowings.java_8_Program_List1;

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {
	
	public static void main(String[] args) {
		
		int sum = IntStream.range(1,111).sum();
		
		System.out.println(sum);
	}

}
