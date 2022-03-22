package com.dv.project;

public class Phone {
	int price;
	int ram;
	String brand="Nokia";
	//===non parameterized constructor===
	public Phone() 
	{
		System.out.println("this is from phone class");
	}
	//====parameterized constructor====
	public Phone(int p,int r)
	{
		price=p;
		ram=r;
	} 
	public void call(){ 
		System.out.println("Calling You...");
	}
	public void msg(String msg)
	{
		System.out.println(msg);
		
	}
	public void radio()
	{
		System.out.println("Listening Naan pizhai song");
	}
	public static void main(String[] args) 
	{
		Phone obj2=new Phone(2000,4);
		System.out.println(obj2.price);
		obj2.radio();
			}

}
