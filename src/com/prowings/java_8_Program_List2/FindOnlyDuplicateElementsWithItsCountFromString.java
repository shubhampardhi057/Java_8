package com.prowings.java_8_Program_List2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateElementsWithItsCountFromString {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("AA","BB","AA","CC");
		
		Map<String,Long> namesCount = names.stream()
											.filter(x -> Collections.frequency(names,x)>1)
											.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(namesCount);
	}

}
