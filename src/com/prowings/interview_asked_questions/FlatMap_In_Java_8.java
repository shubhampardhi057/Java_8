package com.prowings.interview_asked_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_In_Java_8 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java","stream","flatmap","example");
		
		List<Character> distinctCharacters = words.stream()
													.flatMap(word -> word.chars().mapToObj(c -> (char)c))
													.distinct()
													.collect(Collectors.toList());
		System.out.println(distinctCharacters);
	}

}
