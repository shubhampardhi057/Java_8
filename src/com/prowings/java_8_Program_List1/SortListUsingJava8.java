package com.prowings.java_8_Program_List1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUsingJava8 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(8);
		list.add(4);
		
		Collections.sort(list);//Asscending
		Collections.reverse(list);//Descending
		
		System.out.println(list);
		
		list.stream().sorted().forEach(s -> System.out.println(s));//Asscending
		
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));//Decending
	}
}
