package com.prowings.special_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumValueFromList {
	
	public static void main(String[] args) {
		
		  List<Integer> numbers = Arrays.asList(5, 2, 80, 1, 6, 3, 9, 4, 7);

	      Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);

	        if (maxValue.isPresent())
	        {
	            System.out.println("Maximum value: " + maxValue.get());
	        } 
	        else
	        {
	            System.out.println("The list is empty.");
	        }
	}

}
