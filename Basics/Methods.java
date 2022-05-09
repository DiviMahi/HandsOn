package com.dv.codingjava;

public class Methods 
{
	char name='D';
	static char name2='R';
	int a=10;int b=20;
	Methods()
	{
		System.out.println("I m from method class"+name);
	}
	void add() {
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Methods.multi(2,3,5);
		Methods.multi(5.5,25.7);
		Methods.multi(4.5, 5);
		Methods.multi(5, 4.6);
	}
	static void  multi(double a,double b)
	{
		System.out.println(a*b);
		
	}
	
    static void  multi(float a,float b,float c) {
    	System.out.println(a*b*c);
    }
     static void multi(float a,int n) {
    	 System.out.println(a*n);
     }
     static void multi(int n,float a)
     {
    	 System.out.println(a*n);
     }
}
