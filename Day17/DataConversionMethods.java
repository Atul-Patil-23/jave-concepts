package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		// This is for string to primitive data type
		//1) String ...> int
		/*
		String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		*/

		//2)  String ...> double
		/*String s1="10.2";
		String s2="11.1";
		System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));
	*/
		
		//3) String..> Boolean
		/*String s1="java"; // other than true if you pass any string that will return false 
		System.out.println(Boolean.parseBoolean(s1));
	*/
		
		
		// int, double, boolean, char ...> String
		int a=10;
		double db=10.3;
		boolean bl=true;
		char c='A';
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(db));
		System.out.println(String.valueOf(bl));
		System.out.println(String.valueOf(c));
		
	}

}
