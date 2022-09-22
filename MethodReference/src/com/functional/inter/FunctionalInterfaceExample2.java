package com.functional.inter;

public class FunctionalInterfaceExample2 implements Sayable1{

	@Override
	public void say(String msg) {
		
		System.out.println(msg);
		
		
	}
	public static void main(String[] args) {
		
		
		FunctionalInterfaceExample2 fun=new FunctionalInterfaceExample2();
		
		
		fun.say("this is also functional inteface with any number of object class");
	}

}
