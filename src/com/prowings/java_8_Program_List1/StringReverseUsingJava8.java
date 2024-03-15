package com.prowings.java_8_Program_List1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverseUsingJava8 {
	
	public static void main(String[] args) {
		
		System.out.println(reverse("Shubham"));
	}

	private static String reverse(String string) {
		
		return  Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		
		
	}

}
