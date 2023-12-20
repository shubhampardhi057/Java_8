package com.prowings.java_8_Program_List1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckTwoStringAreAnagram {
	
	public static void main(String[] args) {
		
		String s1 = "RaceCar";
		String s2 = "CarRace";
		
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		if(s1.equals(s2))
		{
			System.out.println("Two strings are Anagrams");
		}
		else
		{
			System.out.println("Two strings are not Anagrams");
		}
	
	}

}