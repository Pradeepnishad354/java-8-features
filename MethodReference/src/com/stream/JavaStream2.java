package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product2{
	
	
	int id;
	String name;
	float price;
	
	
	public Product2(int id,String name,float price) {
	this.id=id;
	this.name=name;
	this.price=price;
	
}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class JavaStream2 {
	
	public static void main(String[] args) {
		
		List<Product> productList1=new ArrayList<Product>();
		productList1.add(new Product(1,"hp",300000f));
		productList1.add(new Product(2,"dell",40000f));
		productList1.add(new Product(3,"asus",50000f));
		productList1.add(new Product(4,"lenovo",45000f));
		
		//filtering data 
		productList1.stream().
		filter(product1->product1.price==300000)
		.forEach(product1->System.out.println(product1.name));
		
	// convert product list into Set
		
		Set<Float> productListSet=productList1.stream().
		filter(product->product.price<300000)
		.map(product->product.price)
		.collect(Collectors.toSet()); //collect as set t remove dublicate element 
		
		System.out.println(productListSet);
		
		
// converting product list into map
		System.out.println("_______________________________________");
		Map<Integer,String> productlistMap=productList1.stream()
				
				
	.collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(productlistMap);
		
		
	//method reference in stream
		
	/*
	 * List<Float> productPrice=productList1.stream() .filter(p->p.price>40000)
	 * 
	 * .map(Product2::getPrice). collect(Collectors.toList());
	 * 
	 * System.out.println(productPrice);
	 */
				
		
	}
	
	

}
