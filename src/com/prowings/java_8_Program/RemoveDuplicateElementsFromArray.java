package com.prowings.java_8_Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArray {
	
	public static void main(String[] args) {
		

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
	
        Set<Integer> uniqueElements = new HashSet<>();
        
        Set<Integer> duplicteElemnts =listOfIntegers.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());
        
        
        System.out.println(duplicteElemnts);
	}

}
