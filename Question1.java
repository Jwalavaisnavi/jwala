package org.jsp.test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Question1 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Characters");
		String input = scanner.next();
	
		String rev = reversed(input);

		
		String output = "";
		for (int i = 0; i < rev.length(); i++) 
		{
			char ch = rev.charAt(i);
			
			char convert =  (char)(ch+1);
			
			output += convert;
		}
		
		System.out.println(output);
	}
	
	public static String reversed (String s1)
	{
		String temp = "";
		for (int i = s1.length()-1 ; i >= 0 ; i--) 
		{
			char ch = s1.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}

}
