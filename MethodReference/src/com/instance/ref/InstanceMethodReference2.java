package com.instance.ref;



interface Sayable{
	
public void say();
}

public class InstanceMethodReference2 {
	
	public void something() {
		System.out.println("this is non static method");
	}
	public static void main(String[] args) {
		
	// creating object 
	InstanceMethodReference2 instance=new InstanceMethodReference2();
	Sayable sayable=instance::something;
	
	//calling interface method
	sayable.say();
	
	// refering non static method using anonymous object
	
	Sayable sayable1=new InstanceMethodReference2()::something;
	
	sayable1.say();
	
	
	
	
	
	}
	
	
	

}
