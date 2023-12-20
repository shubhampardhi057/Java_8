package com.prowings.streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWithStream {

	public static void main(String[] args) {
		
		Map<Integer,String> stdMap = new HashMap<>();
		stdMap.put(13,"Ram");
		stdMap.put(10,"Sham");
		stdMap.put(30,"Naam");
		stdMap.put(18,"Dham");
		stdMap.put(24,"Shubham");
		
		stdMap.forEach((k,v) -> System.out.println("Key is : "+ k +" && Value is : "+v));
		
//	=======================================================================
		
		Map<Integer,String> sortedStudent = stdMap.entrySet()
												.stream()
//												.sorted(Map.Entry.comparingByKey())
												.sorted(Map.Entry.comparingByValue())
												.collect(
														Collectors.toMap(e -> e.getKey(),
																		  e -> e.getValue(),
																		  (e1,e2) -> e1,
																		  LinkedHashMap::new)
														
														);
		System.out.println("After Sorting : "+ sortedStudent);
	}
}
