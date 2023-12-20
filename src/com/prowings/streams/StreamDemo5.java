package com.prowings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {
	
	public static void main(String[] args) {
		
		List<List<String>> listOfLists = Arrays.asList(
				
				Arrays.asList("apple","orange"),
				Arrays.asList("banana","grape"),
				Arrays.asList("kiwi","mango","pineapple")
				);
		
		List<String> flatList = listOfLists.stream()
											.flatMap(List::stream)
											.distinct()
											.collect(Collectors.toList());
		
		System.out.println("Original list of lists : "+ listOfLists);
		System.out.println("Flattend and Distinct lists : "+ flatList);
	}

}
