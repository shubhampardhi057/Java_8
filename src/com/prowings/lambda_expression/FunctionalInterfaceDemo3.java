package com.prowings.lambda_expression;

interface MathsInterface2{
	
	public int add(int a,int b);
}
public class FunctionalInterfaceDemo3 {
	
	public static void main(String[] args) {
		
		MathsInterface2 m = (a,b) -> {
			 							int sum;
			 							sum = a+b;
			 							System.out.println("\n\n\t Addition is : "+ sum);
			 							return sum;
			
		                              };
		                              
		      int total = m.add(40,90);
		      
		      System.out.println("\n\n\t Addition is from main is : " + total);
	}  

}
