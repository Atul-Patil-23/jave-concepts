package day7;

import java.util.Scanner;

public class TakingMultipleFromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // create object of scanner class
		
		//Ex1
		/*System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Sum of 2 numbers is:"+(num1+num2));
		*/
		
		//Ex2
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter unknown value");
		Object value=sc.next();  // this will convert all value into string. here we added Object data type
		System.out.println(value);
	}

}
