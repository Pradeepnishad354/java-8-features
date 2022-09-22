package com.lambdaexpression;

public class LambdaExpressionExample2 {
	
	
	public static void main(String[] args) {
		
		Sayable s=()->{
			
			System.out.println("this is the using of lambda expression");
		};
		s.say();
		
	}
	

}
