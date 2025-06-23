package day9;

import java.util.Arrays;

public class ReversePartInString {

	public static void main(String[] args) {
		String str="Welcome to java";
		String arr[]=str.split(" ");
		System.out.println("Split string:"+Arrays.toString(arr));
		String rev="";
		for(int i=arr[2].length()-1; i>=0; i--)
		{
			rev=rev+arr[2].charAt(i);
		}
		System.out.println(rev);
		System.out.println("Full string:"+arr[0]+" "+arr[1]+" "+rev);
	}

}
