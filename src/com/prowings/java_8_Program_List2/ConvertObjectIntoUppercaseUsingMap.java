package com.prowings.java_8_Program_List2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertObjectIntoUppercaseUsingMap {
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("aa","bb","cc","dd");
		
		List<String> nameList = myList.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		
		System.out.println(nameList);
	}

}
