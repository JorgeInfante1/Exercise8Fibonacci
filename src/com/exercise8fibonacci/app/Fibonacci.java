package com.exercise8fibonacci.app;


import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		//Variable Declaration
		int cont1=0;
		int cont2=1;
		long fibonacci=1;
		int bound=0;
		
		Scanner input=new Scanner(System.in);
		
		do 
		{
		
			System.out.println("How many Fibonacci's do you want to calculate?: ");
			bound=input.nextInt();
			if(bound<=0)
			{
				System.out.println("You have to input a number bigger than 0:  ");
			}
			
		}while(bound<=0);
		
		for(int i=0;i<bound;i++)
		{
			
			System.out.print(fibonacci+" ");
			fibonacci=cont1+cont2;
			cont1=cont2;
			cont2=(int)fibonacci;
		}

	}

}
