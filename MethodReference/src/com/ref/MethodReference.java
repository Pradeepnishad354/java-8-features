package com.ref;

public class MethodReference {
	
public  static void Saysomething(){
			
		System.out.println("this is a static method");	
			
		}
public static void main(String[] args) {
	
	Sayble say=MethodReference::Saysomething;
	
	say.sayble();
}
	
		
	}


