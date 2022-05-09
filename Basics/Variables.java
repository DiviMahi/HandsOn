package com.dv.codingjava;

public class Variables
{
	int a=25;
	static int b=30;
	public static void main(String[] args)
	{
		int c=50;
		System.out.println(c);
		System.out.println(Variables.b);
		
		Variables obj1=new Variables();
		System.out.println(obj1.a);
		
		
		//DECISION MAKING STATEMENTS
		 int x=10;
		 int y=25;
		 int z=30;
		 //ELSE IF LADDER
		 if(y>x && y>z)
		 {
			 System.out.println("Y is greater");
			 
		 }
		 else if(x>y && x>z)
		 {
			 System.out.println("X is greater");
		 }
		 else 
		 {
			 System.out.println("z is greater");
		 }
		 //IF ELSE
		 
		 if(true)
		 {
			 System.out.println(" If block got executed");
			 
		 }
		 else
		 {
				
			System.out.println("Else block got executed");	
			
	}
	}
}

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

