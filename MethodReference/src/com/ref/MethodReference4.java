package com.ref;

import java.util.function.BiFunction;

class Arithmetic1{
	
	public static int add(int a,int b) {
		
		return a+b;
	}
	
public static float add(int a,float b) {
		
		return a+b;
	}

public static float add(float a,float b) {
	
	return a+b;
}
	
	
	
}


public class MethodReference4 {
	
	public static void main(String[] args) {
		
		
		BiFunction<Integer,Integer,Integer> a1=Arithmetic1::add;
	int result1=a1.apply(10,10);
		
		
		BiFunction<Integer,Float,Float> a2=Arithmetic1::add;
	float result2=	a2.apply(10,13.3f);
		
		BiFunction<Float,Float,Float> a3=Arithmetic1::add;
		float result3=a3.apply(10.0f,13.3f);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
