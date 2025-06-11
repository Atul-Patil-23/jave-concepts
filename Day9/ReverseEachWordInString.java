package day9;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str="Welcome To Java";
		String words[]=str.split(" ");
		System.out.println("splitted word:"+Arrays.toString(words));
		String revString="";
		for(String w:words)
		{
			String revWord="";
			for(int i=w.length()-1; i>=0; i--)
			{
				revWord=revWord+w.charAt(i);
			}
			revString=revString+revWord+" ";
			
		}
		System.out.println(revString);
	}

}
