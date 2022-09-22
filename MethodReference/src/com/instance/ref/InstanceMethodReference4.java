package com.instance.ref;

import java.util.function.BiFunction;

class Arithmetic {
	
	public int add(int a,int b) {
		
		return a+b;
	}
}

public class InstanceMethodReference4 {
	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer, Integer> bi=new Arithmetic()::add;
		
	int a=	bi.apply(30, 20);
	
	System.out.println(a);
		
	}
	
	

}
