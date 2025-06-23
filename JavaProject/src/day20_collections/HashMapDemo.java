package day20_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration
		//Map mymap=new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Adding pair
		hm.put(101, "John");
		hm.put(101, "Scotty");
		hm.put(102, "Atul");
		hm.put(103, "Akshay");
		hm.put(104, "Sumit");
		hm.put(102, "Sachin");
		
		System.out.println(hm); //{101=Scotty, 102=Sachin, 103=Akshay, 104=Sumit}	 	
		
		// size of hashmap
		System.out.println("size of hashmap:"+hm.size());
		
		//remove pair
		hm.remove(103);// 103 is key of the pair
		System.out.println("After remove pair:"+hm); //{101=Scotty, 102=Sachin, 104=Sumit}
		
		// access value of the key
		System.out.println(hm.get(104)); // 104 is key
		
		// get all the keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104]
		
		// get all the values
		System.out.println(hm.values()); // [Scotty, Atul, Sumit]
		
		// get keys along with values
		System.out.println(hm.entrySet()); // [101=Scotty, 102=Atul, 104=Sumit]
		
		// Reading data from hashmap
		// using for..each loop
		/*for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		*/
		
		//using iterator
		Iterator <Entry <Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty()); // true
		
		
		
		
	}

}
