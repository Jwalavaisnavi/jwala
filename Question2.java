package org.jsp.test;

import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scanner.nextInt();
		
		int [] array = new int[num];
		
		System.out.println("Enter "+num+" elements");
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = scanner.nextInt();
		}
		
		int max = 0;
		for (int i = 0; i < array.length; i++) 
		{
			int temp = 0;
			for (int j = i; j < array.length; j++) 
			{
				temp = array[i] - array[j];
				if (max < temp)
				{
					max = temp;
				}
			}
		}
		System.out.println(max);
		
	}

}
