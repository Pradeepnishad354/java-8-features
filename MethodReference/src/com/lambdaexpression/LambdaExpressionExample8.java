package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
	
	int id;
	String name;
	float price;
	
	public Product(int id ,String name,float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
}



public class LambdaExpressionExample8 {
	
	public static void main(String[] args) {
		
		
		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(1 ," Hp ",30000));
		list.add(new Product(2 ," lenovo ",28000));
		list.add(new Product(3 ," dell ",34000));
		
		System.out.println("sorting through name");
		
		
		Collections.sort(list,(p1,p2)->{
			
			return p1.name.compareTo(p2.name);	
			
		});
		
		for(Product p:list) {
			
			System.out.println(p.id+""+p.name+""+p.price);
		}
		
		//using lambda for filter
		
		Stream<Product> filterdata=list.stream().filter(p->p.price>28000);
		
		// using lambda to iterate through collection
		
		filterdata.forEach(product->System.out.println(product.name+""+product.price));
	}

}
