package com.prowings.lambda_expression;

interface MathsInterface{
	
	public int add(int a,int b);
}
public class FunctionalInetrfceDemo2 {

	public static void main(String[] args) {
		
		MathsInterface m = (a,b) ->  (a + b);
		
//		System.out.println(m.add(50,90));
		
		int sum = m.add(50,90);
		
		System.out.println("\n\n\t Addition is : " +sum);
		
	}
}
