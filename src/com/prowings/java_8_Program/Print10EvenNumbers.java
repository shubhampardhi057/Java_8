package com.prowings.java_8_Program;

import java.util.stream.IntStream;

public class Print10EvenNumbers {
	
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1,10).map(i -> i*2).forEach(System.out::println);
	}

}
