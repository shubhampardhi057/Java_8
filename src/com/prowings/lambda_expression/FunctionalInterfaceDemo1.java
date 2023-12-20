package com.prowings.lambda_expression;

interface BankInterface{
	
	public void show();
}
public class FunctionalInterfaceDemo1 {
	
	public static void main(String[] args) {
		
		BankInterface b = () -> System.out.println("This is show method in BankInterface !!!!");
		
		b.show();
	}

}
