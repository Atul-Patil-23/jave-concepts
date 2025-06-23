package day21;

import java.util.HashSet;

public class PrintArrayWithoutDuplicateElement {

	public static void main(String[] args) {
		String str[]= {"Atul","Sam","John", "Atul","Sam","nil"};
		HashSet set=new HashSet();
		for(int i=0; i<=str.length-1; i++)
		{
			set.add(str[i]);
		}
      
		System.out.println(set);
		
		
		
	}

}
