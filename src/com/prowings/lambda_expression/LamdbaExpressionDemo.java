package com.prowings.lambda_expression;

interface FunctInterface
{
    void abstractFun(int x);
 
    default void normalFun()
    {
       System.out.println("Hello");
    }
}
public class LamdbaExpressionDemo {


	public static void main(String[] args) {
		
		FunctInterface fobj = (int x) -> System.out.println(2 * x);
		
		fobj.abstractFun(10);
		
		fobj.normalFun();
		
	}
}
