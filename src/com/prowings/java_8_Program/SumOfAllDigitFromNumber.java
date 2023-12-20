package com.prowings.java_8_Program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitFromNumber {
	
	public static void main(String[] args) 
    {
        int i = 15623739;
         
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
         
        System.out.println(sumOfDigits);
    }

}
