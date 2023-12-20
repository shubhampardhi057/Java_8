package com.prowings.java_8_Program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysWODuplicates {
	
	public static void main(String[] args) {
		
		int [] a = new int [] {4,5,2,6,7,8,9,0};
		int [] b = new int [] {1,9,3,5,2,6,1,3};
		
		int [] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(c));
		
	}

}
