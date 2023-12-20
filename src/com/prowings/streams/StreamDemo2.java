package com.prowings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
	
	public static void main(String[] args) {
		
		List<String> progLanguages = Arrays.asList("Java","Python","JavaScript","C#","Ruby");
		
		List<String> upperCaseLanguages = progLanguages.stream()
														.map(String::toUpperCase)
														.collect(Collectors.toList());
		
		System.out.println("Original List : "+progLanguages);
		System.out.println("UpperCased List : "+upperCaseLanguages);
	}

}
