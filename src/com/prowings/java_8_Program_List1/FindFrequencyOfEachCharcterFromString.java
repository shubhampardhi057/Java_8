package com.prowings.java_8_Program_List1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharcterFromString {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		
		System.out.println(charCountMap);
	}

}
