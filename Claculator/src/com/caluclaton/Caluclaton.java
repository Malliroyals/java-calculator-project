package com.caluclaton;
import com.addition.Addition;
import com.subtraction.Subtraction;
import com.division.Division;
import com.multiplication.Multiplication;


import java.util.Scanner;

public class Caluclaton 
    {

	public static void main (String[] args)
	{
		int choice =0;
		Scanner input = new Scanner(System.in);
		float n1,n2;
		
		System.out.println("\nWelcome to Caluclator project!");
		try
		{
			while(choice !=5)
			{
				System.out.println("\n1 - Addition");
				System.out.println("\n2 - Subtraction");
				System.out.println("\n3 - Multiplication");
				System.out.println("\n4 - Division");
				System.out.println("\n5 - Exit");
				System.out.println("\n Enter Your Choice");
				choice = input.nextInt();
				
				if (choice ==5)
				{
					System.out.println("\n Thanks For Using");
					System.exit(0);
				}
				if(choice > 0&&choice <6 ) {
				System.out.println("\nEnter First value");
				n1= input.nextFloat();
				
				System.out.println("\nEnter Second value");
				n2= input.nextFloat();
			
			if (choice == 1)
			{
				System.out.println("Sum " +Addition.addition(n1,n2));
				
			}
			else if (choice == 2)
			{
				System.out.println("Subtraction " +Subtraction.subraction(n1,n2));
			}
			else if (choice == 3)
			{
				System.out.println("Multiplication " +Multiplication.multiplication(n1,n2));
			}
			else if (choice == 4)
			{
				System.out.println("Division " +Division.division(n1,n2));
			}}
			else
			{
				System.out.println("\n Please select the Available Choice");
			}
		}
	}
	catch (Exception ex)
	{
		System.out.println("\nError: "+ ex.toString() + "Occured");
	}
}
}