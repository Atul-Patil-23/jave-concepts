package day9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String rev="";
		System.out.println("Entered string is:"+str);
		for(int i=str.length()-1; i>=0; i--)
		{
			 rev=rev + str.charAt(i);
		}
		System.out.println("Reverse number is:"+rev);

		
				
		// by converting string to char array type
		/*String s="welcome";
		String rev= "";
		char a[]=s.toCharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string:"+rev);
		*/
		
		//Reverse using string buffer class
		
		/*StringBuffer s= new StringBuffer("welcome");
		System.out.println("Reverse string is:"+s.reverse());
		*/
		
		//Reverse using string builder class
		/*
		StringBuilder s= new StringBuilder("welcome");
		System.out.println("Reverse string is:"+s.reverse());
		*/
		

	}

}
