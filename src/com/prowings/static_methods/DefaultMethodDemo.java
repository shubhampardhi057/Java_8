package com.prowings.static_methods;

public class DefaultMethodDemo implements Default_Interface{
	
	public static void main(String[] args) {
		
		Default_Interface di = new DefaultMethodDemo();
		
		di.hello();
	}

}
