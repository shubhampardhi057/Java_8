package com.prowings.static_methods;

public class StaticMethodDemo implements Static_Interface {
	
	public static void main(String[] args) {
		
		Static_Interface si = new StaticMethodDemo();
		
		Static_Interface.show();
		
		si.call("hello");
		
	}

	@Override
	public void call(String s) {
		
		System.out.println("inside call method !!!");
	}

}
