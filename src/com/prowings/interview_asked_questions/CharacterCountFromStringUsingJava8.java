package com.prowings.interview_asked_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountFromStringUsingJava8 {
	
	public static void main(String[] args) {
		
		String input = "shubhampardhi";
		
		Map<String,Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
				
	}

}
