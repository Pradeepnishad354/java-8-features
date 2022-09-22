package com.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	
	int id;
	String name;
	float price;
	
	
	public Product(int id,String name,float price){
		
		this.id=id;
		this.name=name;
		this.price=price;
	
	}
	
}

public class StreamFilter {
	
	public static void main(String[] args) {
		
		List<Product> p=new ArrayList<>();
		
		p.add(new Product(1,"HP",28000f));
		p.add(new Product(2,"Dell",30000f));
		p.add(new Product(3,"Lenovo",35000f));
		p.add(new Product(4,"Asus",40000f));
		
		// filtering price
	p.stream().filter(p3->p3.price>30000)
	
	//fetching the price
	.map(p4->p4.price)
	.forEach(System.out::println);
	
	List<Float> price=p.stream()
			.filter(p5->p5.price >30000)
			.map(pm->pm.price)
		    .collect(Collectors.toList());
	         System.out.println(price);
//	
		
		
	}

	
	

}
