package com.instance.ref;

public class InstanceReferenceMethod1 {
	
	public int run(int a,int b) {
		
		return a+b;
		
		
	}
	
	public static void main(String[] args) {
		
		InstanceReferenceMethod1 instance=new InstanceReferenceMethod1();
		
	Sayble1 say=instance::run;
	
	// calling interface method
	int a= say.run(10,12);
	
	System.out.println(a);
	
	}
	
	

}
