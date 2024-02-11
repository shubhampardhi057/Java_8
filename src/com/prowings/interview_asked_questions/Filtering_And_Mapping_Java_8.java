package com.prowings.interview_asked_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_And_Mapping_Java_8 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","banana","avacado","orange","grape");
		
		List<String> result = words.stream()
									.filter(word -> !word.startsWith("a"))
									.map(String::toUpperCase)
									.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
