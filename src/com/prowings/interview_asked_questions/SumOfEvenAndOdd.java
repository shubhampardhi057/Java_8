package com.prowings.interview_asked_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,6,1,9,88,10};
		
		List<Integer> mylist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> evenList = mylist.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
		List<Integer> oddList = mylist.stream().filter(num -> num%2 !=0).collect(Collectors.toList());
		
		int evenSum = evenList.stream().mapToInt(Integer::intValue).sum();
		int oddSum = oddList.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
	}

}
