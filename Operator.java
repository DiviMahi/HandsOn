package com.dv.codingjava;

public class Operator
{
	public static void main(String[] args) 
	{
		//UNARY OPERATORS
		
		    int a=13;
		    System.out.println(a);
		    System.out.println(++a);
		    System.out.println(a++);
		    System.out.println(a);
		    System.out.println(--a);
		
		//BINARY OPERATORS-arithmetic operations
			int b=10;
		    float c=0.5f;
		    System.out.println(b+c);
		    System.out.println(b-c);
		    System.out.println(b*c);
		    System.out.println(b/c);
		    System.out.println(b%c);
		    
		//RELATIOAL OPERATORS-to check a condition
		    System.out.println(b<c);
		    System.out.println(b>c);
		    b=10;
		    c=25;
		    System.out.println(b);
		    System.out.println(b>=c);
		    System.out.println(b<=c);
		    System.out.println(b!=c);
		    System.out.println(b==c);
		    
		   
		   //LOGICAL OPERATORS-to check two conditions
		    int d=70;
		    System.out.println(b<c&&d>c);
		    a=20;
		    b=30;
		    c=40;

		    System.out.println(a>b&&++c>b);
		    System.out.println(a++<b);
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    
		    
		    //BITWISE OPERATORS
		    
		    System.out.println(2&4);
		    
		    

	}
	
	
	

}
