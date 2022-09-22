package com.lambdaexpression;

public class LambdaExpressionExample7 {
	
	
	public static void main(String[] args) {
		
		
		//Thread example without lambda 
		Runnable r1=new Runnable() {
		
		public void run() {
			
			System.out.println("Thread is running ");
		}
	};
	
	Thread t1=new Thread(r1);
	
	t1.start();
	
	
	// thread with lambda expression
	
	Runnable r2=()->{
		System.out.println("thread is running1");
		
	};
	
	Thread t=new Thread(r2);
	
	t.start();
	
	
	}
}
