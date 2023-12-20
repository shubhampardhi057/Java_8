package com.prowings.java_8_Program_List2;

import java.util.Arrays;

public class SortArrayAndConvertIntoStream {
	
	public static void main(String[] args) {
	
		int [] array = {99,55,203,99,4,91};
		
		Arrays.parallelSort(array);
		
		Arrays.stream(array).forEach(n -> System.out.print(n + " "));
	}

}
