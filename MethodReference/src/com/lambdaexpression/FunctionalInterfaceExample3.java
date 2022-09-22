package com.lambdaexpression;

// lambda Expression with single parameter

interface Sayable2{
	
	public String say(String name);
}

public class FunctionalInterfaceExample3 {
	public static void main(String[] args) {
		
	
	Sayable2 s=(name)->{
		
		return "hello"+name;
		
		
		
	};
	System.out.println(s.say("pradeep"));
	
	
	
	//you can remove the parenthesis
	
	Sayable2 s2=name->{
		return "hello"+name;
	};
	
	System.out.println(s2.say("Pritesh"));
	}	

}
