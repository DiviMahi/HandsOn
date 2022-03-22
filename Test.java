package com.dv.project;

public class Test extends SmartPhone
{
public Test(int price,int ram,int c,int camcount)
{
	super(price,ram,c,camcount);
	System.out.println("from test class");
}

public static void main(String[] args) 
{
	Test object=new Test(50000,5,120,3);
	System.out.println(object.price);
	SmartPhone obj5=new SmartPhone(40000,35,12,35);
	System.out.println(obj5.price);
	System.out.println(obj5.ram);
	SmartPhone obj6=new SmartPhone(50000,32,120,3);
	System.out.println(object.cam);
	
}
} 
