package com.instance.ref;

public class InstanceMethodReference3 {
	
	public void msg() {
		
		System.out.println("this is non static method and use predefine functional Interface");
		
	}
	
	public static void main(String[] args) {
		
		
		InstanceMethodReference3 instance3=new InstanceMethodReference3();
	
	//using predefine function interface
	
		Runnable r=instance3::msg;
		Thread t2=new Thread(r);
		
		t2.start();
		
//	Thread t=new Thread(instance3::msg);
//	
//	t.start();
//	
	
	

			
			
	
	}	

}
