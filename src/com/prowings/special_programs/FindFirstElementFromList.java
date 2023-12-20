package com.prowings.special_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElementFromList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,2,3,4,5,6,7,8,9,10);
		
		Optional<Integer> firstElement = numbers.stream().findFirst();
		
		 if (firstElement.isPresent()) 
		 {
	            System.out.println("First element: " + firstElement.get());
	     }
		 else
		 {
	            System.out.println("The list is empty.");
	     }
		
	
		
	}
}
