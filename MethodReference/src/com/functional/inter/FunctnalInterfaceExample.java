package com.functional.inter;

public class FunctnalInterfaceExample implements Sayable {

	@Override
	public void say(String msg) {
	System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
	
	 FunctnalInterfaceExample file=new FunctnalInterfaceExample();
	 
	 
	 file.say("this is functional interface ");
	}
	 

}
