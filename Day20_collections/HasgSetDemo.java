package day20_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasgSetDemo {

	public static void main(String[] args) {
		// Declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();  //we can store child class object into parent.
		//HashSet <String>myset=new HashSet<String>();
		
		
		// adding elements into hashset
		myset.add(100);
		myset.add(100);
		myset.add("welcome");
		myset.add(false);
		myset.add(null);
		myset.add(10.4);
		myset.add('A');
		
		System.out.println(myset); //[null, A, 100, false, 10.4, welcome]
		System.out.println(myset.size());
		
		// remove element from hashset
		myset.remove(10.4); // here index not supported. So add direct removable element
		System.out.println("After removing:"+myset);
		
		// inserting element is not possible		
		// access a specific element - not possible
	
		// convert hashset...> arraylist
		ArrayList al=new ArrayList(myset);
		System.out.println(al); // [null, A, 100, false, welcome]
		System.out.println(al.get(3));
		
		// Reading all elements using for..each loop
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		// using iterator
		Iterator it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		// clearing all elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());

	}

}
