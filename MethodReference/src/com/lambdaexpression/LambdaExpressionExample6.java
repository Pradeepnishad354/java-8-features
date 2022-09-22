package com.lambdaexpression;

interface Sayable3{
	
	String say(String msg);
}

public class LambdaExpressionExample6 {
	
	public static void main(String[] args) {
		
		//you can pass multiple statement in lambda expression
		Sayable3 say1=(msg)->{
			String str1="this is demo";
			String str2=str1+msg;
			return str2;
			
		};
		
	System.out.println(	say1.say("for using multiple expression "));
	}

}
