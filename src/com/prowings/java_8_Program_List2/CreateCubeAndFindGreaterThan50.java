package com.prowings.java_8_Program_List2;

import java.util.Arrays;
import java.util.List;

public class CreateCubeAndFindGreaterThan50 {

	public static void main(String[] args) {
		

	     List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	     
	     integerList.stream()
	     				.map(i -> i*i*i)
	     				.filter(i -> i>50)
	     				.forEach(System.out::println);
	}

}
