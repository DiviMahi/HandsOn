package com.dv.codingjava;

public class Constructor {
	Constructor()
	{
		System.out.println("Hlo there! this is constructor");
	}
	public static void main(String[] args) 
	{
		Constructor f=new Constructor();//object of same class
		Methods ob2= new Methods();//object of another class
		System.out.println(ob2.name);//accessing non static variable
		System.out.println(Methods.name2);//accessing static variable
		ob2.add();//accessing a static method
	}
	

}
