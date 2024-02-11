package com.prowings.interview_asked_questions;

import java.util.Arrays;
import java.util.List;

public class ParallelStream_In_Java_8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sumOfSquares = numbers.parallelStream()
									.mapToInt(n -> n * n)
									.sum();
		
		System.out.println(sumOfSquares);
	}

}
