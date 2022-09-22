package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("jay");
		list.add("pritesh");
		list.add("mohan");
		list.add("pradeep");

		
		  list.forEach((n)-> System.out.println(n));  };
		

//	for(String a:list) {
//		System.out.println(a);
//	}

	}

