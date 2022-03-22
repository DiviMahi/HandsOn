package com.dv.overriding;

public class Dog extends Animal {
	
	public void sound() 
	{
		super.sound(); 
		System.out.println("dog making sound:Bow Bow...");
	}
}
