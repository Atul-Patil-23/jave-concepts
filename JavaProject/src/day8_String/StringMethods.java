package day8_String;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1="  Welcome ";
		String s2=new String("to Java");
		String s3=new String("at home");
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println((s1.concat(s2)+s3));
		int len=s1.length();
		System.out.println(len);

		
		// trim()  Remove spaces from left and right
		System.out.println(s1.trim());
		System.out.println(s1.trim().length());
		
		//charAt()  this will return alphabet from string based on index		
		System.out.println(s1.charAt(3));
		
		//contains()  returns true/false
		System.out.println(s1.contains("lco"));
		System.out.println(s2.contains("Ja"));
		
		// equals() , equalsIgnoreCase() - return true or false
		String str1="welcome to java home";
		String str2="Welcome";
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equals("welcome")); //true
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		
		//replace method- replace single character or multiple string
		String s="welcome to selenium java selenium pythod selenium c#";
		System.out.println(s.replace("m", "Z"));
		System.out.println(s.replace("selenium", "playwrite"));
		
		// substring - extract substring form main string
		// starting index - 0
		//ending index - 1
		System.out.println(str1.substring(1, 13));
		System.out.println(str1.substring(3, 6));
		
		
		//toUpperCase()  and toLowerCase()
		/*System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		*/
		
		//split() split the string into multiple parts based on delimeter
		// // * % ^ ( ) - you cannot use as delimeter
		
		String string="abs@gmail.com";
		String a[]=string.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);		
		
		
		//exp1
		String amount="$14,16,19";
		System.out.println(amount.replace("$",""));
		System.out.println((amount.replace("$","")).replace(",", ""));
		
		
		//exp2
		/*s="abc,123@xyz";
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		*/
		
		//exp3
		String name = "John Kenedy";
		System.out.println(name.contains("john")); //false
		System.out.println(name.replace("J", "j").contains("john")); //true
		System.out.println(name.toLowerCase().contains("john"));//true
		
		
	}

}



