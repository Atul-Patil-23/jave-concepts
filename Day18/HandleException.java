package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		try
		{
			System.out.println(100/num); // this statement is throwing exception. thats why its in try block
		}
		// if we dont know what kind of exception throw, then write only Exception.
		// because Exception is parent class of all other exceptions
		catch(Exception e) // "e" is object of Exception class
		{
			System.out.println("Invalide data...");
			System.out.println(e.getMessage());// we will get msg why exception occurred
		}
		
		System.out.println("program completed");
		
	}

}
