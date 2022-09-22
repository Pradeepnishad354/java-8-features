package com.lambdaexpression;



interface Drawable{
	
	public void draw();
}

public class LambdaExpressionExample1 {
	
	public static void main(String[] args) {
		
		int width=20;
// without lambda Expression using anonymous class
		
		Drawable d=new Drawable() {
			
			public void draw() {
				
				System.out.println("draw"+width);
			}
		};
		d.draw();
	
		//with lambda expression
//	Drawable d=()->{
//		
//		System.out.println("lambda expression"+width);
//		
//	};
//	d.draw();
//	
	
	
	
	}

}
