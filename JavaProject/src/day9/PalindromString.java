package day9;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String org_string=sc.next();
		String rev="";
		System.out.println("Original string:"+org_string);
		for(int i=org_string.length()-1; i>=0; i--)
		{
			rev=rev+org_string.charAt(i);
		}
		System.out.println("Reverse string is:"+rev);
		if(org_string.equals(rev))
		{
			System.out.println("Palindrome string");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}

}
