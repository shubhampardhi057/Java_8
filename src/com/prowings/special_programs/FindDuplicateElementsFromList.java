package com.prowings.special_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementsFromList {

	public static void main(String[] args) {
		
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4,4,3, 5, 6, 7, 8, 9, 1);

		  Map<Integer,Long> frequencyMap = numbers.stream()
				  								   .collect(Collectors.groupingBy(n -> n,Collectors.counting()));
		  
		  List<Integer> duplicates = frequencyMap.entrySet().stream()
				  									.filter(entry -> entry.getValue() > 1)
				  									.map(Map.Entry::getKey)
				  									.collect(Collectors.toList());
		  
		  System.out.println("Duplicate elements : " + duplicates);
    

		  
		  
		  
		  
		  
		  
	}
}
