package com.instance.ref;

public class InstanceMethodReference {
	
	public void Something() {
		
		System.out.println("this is instance reference method");
	}
	
	public static void main(String[] args) {
		
		
		InstanceMethodReference instancemethod=new InstanceMethodReference();
		
		Sayble sayble=instancemethod::Something;
		
		sayble.say();
		
		
		
	}

}
