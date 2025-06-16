package day20_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		//ArrayList mylist=new ArrayList(); // store heterogeneous data
		//List mylist=new ArrayList();  // we can store child class object into parent.
		//ArrayList <String>mylist=new ArrayList<String>(); //able to store only string data
		ArrayList mylist=new ArrayList();
		
		//Adding data into arrayList
		mylist.add(100);
		mylist.add(100);
		mylist.add(10.6);
		mylist.add("Welcome");
		mylist.add(false);
		mylist.add('B');
		mylist.add(null);
		mylist.add(null);
		
		// size of ArrayList
		System.out.println(mylist.size());
		
		// Printing arraylist
		System.out.println("arraylist data:"+mylist); // [100, 100, 10.6, Welcome, false, B, null, null]
		
		//Remove element from arraylist
		mylist.remove(1); // support index. so it will remove 2nd number element
		System.out.println("After remove element:"+mylist.size());
		System.out.println(mylist);
		
		// Insert element in arraylist
		mylist.add(2,"Atul");
		System.out.println("After insertion:" +mylist );
		
		//modify/replace/change element in arraylist
		mylist.set(2, "akshay");
		System.out.println("after replacing:"+mylist);// [100, 10.6, akshay, Welcome, false, B, null, null]
		
		// access specific element from arraylist
		System.out.println(mylist.get(4)); // false
		
		//reading all element in arraylist
		// using normal for loop
		/*
		for(int i=0; i<=mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		// using enhanced for loop
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//reading all the element using iterator method
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// checking arraylist is empty or not
		System.out.println(mylist.isEmpty());
		
		// remove all the elements from arraylist
		ArrayList mylist2=new ArrayList();
		mylist2.add("Welcome");
		mylist2.add(false);
		mylist2.add(null);
				
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		// remove all the elements
		mylist.clear();
		System.out.println("is arraylist empty?"+mylist.isEmpty()); // true
		
	}

}
