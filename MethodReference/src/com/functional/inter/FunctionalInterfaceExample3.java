package com.functional.inter;

interface D {

	default void dolt() {
		
		System.out.println(" done");
	}
}

@FunctionalInterface
interface E extends D{
	
	public void msg(String msg);
}
public class FunctionalInterfaceExample3 implements E  {

	@Override
	public void msg(String msg) {
		System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
		
		FunctionalInterfaceExample3 fun1=new FunctionalInterfaceExample3();
		
		fun1.dolt();
		fun1.msg("hello ");
	}

}
