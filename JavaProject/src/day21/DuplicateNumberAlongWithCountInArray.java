package day21;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberAlongWithCountInArray {

	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 3, 3};

        // Map to store number and its count
        Map<Integer, Integer> countMap = new HashMap<>();
  
        for (int num : numbers) 
        {
            if (countMap.containsKey(num)) 
            {
                countMap.put(num, countMap.get(num) + 1);
            } 
            else 
            {
                countMap.put(num, 1);
            }
        }

        // Print duplicates with count
        System.out.println("Duplicate numbers and their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) 
        {    
           System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        
        }

	}

}
