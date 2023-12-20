package com.prowings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {
	
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Orange","Grape","Kiwi");
		
		List<String> result = fruits.stream()
									.filter(fruit -> fruit.startsWith("O"))
									.map(String::toUpperCase)
									.collect(Collectors.toList());
		
		System.out.println("Orignal List :" + fruits);
		System.out.println("Filtered And Uppercasted List :" + result);
	}

}
