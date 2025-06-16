package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingataIntoArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];  // create 7 place to store values 
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the value for position:"+i+":");
			a[i]=sc.nextInt();
		}
		
		System.out.println("The arrays are:"+Arrays.toString(a));
	}

}
