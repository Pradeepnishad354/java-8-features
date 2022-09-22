package com.constructor.ref;




interface Messageable{
	
	Message getMessage(String msg);
	
	
	//classname::new // you can refer a constructor 
	
}
public class Message {
	
	Message(String msg){
		
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		Messageable m=Message::new;
		
		m.getMessage("hello this is constructor reference method");
	}
	
	
	
	
	

}
