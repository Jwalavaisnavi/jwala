package org.jsp.test;

import java.util.Scanner;

public class Question3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int star = num+1;
		int space = -1;
		
		int sum = 0;
		for (int i = 1; i <= num*2; i++) 
		{
			int count = 0;
			if(i <= num)
			{
				star--;
				space++;
			}
			else
			{
				if(i == num+1)
				{
					star = 1;
				}
				else
				{
					star++;
					space--;
				}
			}
			
			for (int j = 1; j <= star; j++) 
			{
					System.out.print("*");
					count++;
			}
			
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= star; j++) 
			{
					System.out.print("*");
					count++;
			}
			System.out.print("- "+count);
			sum = sum + count;
			System.out.println();
		}
		System.out.println("total no. of stars are "+sum);
		
	}

}
