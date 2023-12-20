package com.prowings.java_8_Program;

import java.util.stream.IntStream;

public class PalindromeUsingJava8 {
	
	public static void main(String[] args) {
		
		String str = "ROTATOR";
		
		boolean isItPalindrome = IntStream.range(0,str.length()/2)
											.noneMatch(i -> str.charAt(i) != str.charAt(str.length() -i -1));
		
		if(isItPalindrome)
		{
			System.out.println(str + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}

}
