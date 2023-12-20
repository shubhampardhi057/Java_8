package com.prowings.special_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWith1 {
	
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(123, 45, 678, 1, 12, 198, 1001, 555);
		 
		 List<Integer> numberStartingWithOne = numbers.stream()
				 										.filter(n -> String.valueOf(n).startsWith("1"))
				 										.collect(Collectors.toList());
		 
		 System.out.println("Numbers starting with 1 : "+ numberStartingWithOne);

	}

}
