package com.prowings.optional_class;

import java.util.Optional;

public class OptionalClassDemo {
	
	public static void main(String[] args) {
		
//		String s [] = new String[10];
//		
//		String s1 = s[5].toLowerCase();
//		
//		System.out.println(s1);

//		===================================================
		
		String [] s2 = new String[10];
		
		s2[5] = "SHRIRAM";
		
		Optional<String> checkNull = Optional.ofNullable(s2[5]);
		
		if(checkNull.isPresent())
		{
			String s3 = s2[5].toLowerCase();
			System.out.println("After Lower Case : "+s3);
		}
		else
		{
			System.out.println("Value/String is not present in");
		}
		
		
		
	}

}
