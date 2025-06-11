package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		//Scanner is build in class. 
		// System.in - this means its taking inputs from keyboard
		
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter a number");
		 int num=sc.nextInt(); // nextInt means its taking integer value from keyboard
		 System.out.println(num);
		 */
		
		/*System.out.println("Enter a decimal number");
		double num=sc.nextDouble();
		System.out.println(num);
		
		*/
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println(str);
		
	}

}
