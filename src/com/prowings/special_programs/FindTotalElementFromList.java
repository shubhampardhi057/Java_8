package com.prowings.special_programs;

import java.util.Arrays;
import java.util.List;

public class FindTotalElementFromList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long totalElements = numbers.stream().count();
		
		System.out.println("Total number of element : "+ totalElements);
	}

}
