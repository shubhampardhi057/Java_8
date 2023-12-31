package com.prowings.java_8_Program_List1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordFromString {
	
	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";
		
		String reversedStr = Arrays.stream(str.split(" "))
									.map(word -> new StringBuffer(word).reverse())
									.collect(Collectors.joining(" "));
		
		System.out.println(reversedStr);
		
	}

}
