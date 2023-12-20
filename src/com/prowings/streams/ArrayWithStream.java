package com.prowings.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayWithStream {
	
	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50,60,70,80,90,100};
		
		int sum;
		
		sum = Arrays.stream(array).sum();
		
		System.out.println("\n\n\t sum of all elements are :"+sum);
		
//		Find maximum value from array
		
		System.out.println("\n\n\t Maximum value from an array :"+ Arrays.stream(array).max());
		
		Stream<String> streamOfArray = Stream.of("aaa","bbb","ccc");
		
		streamOfArray.forEach(c -> System.out.println(c));
	}

}
