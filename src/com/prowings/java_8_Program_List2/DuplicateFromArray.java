package com.prowings.java_8_Program_List2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromArray {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5};
		
		
		System.out.println(conatinsDuplicate(nums));
	}
	
	public static boolean conatinsDuplicate(int [] nums)
	{
		List<Integer> list = Arrays.stream(nums)
									.boxed()
									.collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>(list);
		
		if(set.size() == list.size()) {
			return false;
		}
		return true;
	}

}
