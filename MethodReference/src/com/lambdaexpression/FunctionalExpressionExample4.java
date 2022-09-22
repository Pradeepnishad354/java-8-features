package com.lambdaexpression;


interface Add{
	
	// multiple parameter
	public int add(int a,int b);
}
public class FunctionalExpressionExample4 {
	
	public static void main(String[] args) {
		
	Add add=(a,b)->a+b;
	System.out.println(add.add(10, 20));
		
		
	};
	
	Add add1=(int a,int b)->a+b;{
		
		System.out.println(add1.add(20, 40));
	};

}
