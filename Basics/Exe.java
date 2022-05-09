package com.dv.codingjava;

public class Exe {
	public static void main(String[] args)
	{
		int a=10;
		if(a%2==0)
		{
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
		for(int i=1;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		int z=1;
		while(z<50)
		{
			if(!(z%2==0))
			System.out.println(z);
			z++;
		}
		
	}

}


