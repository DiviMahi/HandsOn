package com.dv.project;

public class SmartPhone extends Phone
{
	String brand = "Moto";
	int ram;
	int price;
	int cam;
	int camcount;
	public SmartPhone(int p,int r,int c,int count)
	{
		super(p,r);
		cam=c;
		camcount=count;
	}
	 
public void selfiee()
{
	System.out.println("Took selfiee with You..");
	
}
public void play()
{
	System.out.println("Playing bike riding...");
}
public static void main(String[] args)
{
	SmartPhone obj1=new SmartPhone(10000,32,25,2);
	System.out.println("Brand:"+obj1.brand);
	System.out.println("ram:"+obj1.ram);
	obj1.call();
	obj1.msg("Hlo There!");
	obj1.radio();
	System.out.println(obj1.camcount);
	
	
}
}