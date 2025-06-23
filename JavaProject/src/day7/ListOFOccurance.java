package day7;

import java.util.HashMap;

public class ListOFOccurance {

	public static void main(String[] args) {
	      int[] numbers = {2, 3, 2, 4, 3, 2, 5, 4, 5, 5};

	        // Count frequency using HashMap
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        for (int num : numbers) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Output result
	        System.out.println("Number frequencies:");
	        for (Integer key : frequencyMap.keySet()) {
	            System.out.println("Number " + key + " appears " + frequencyMap.get(key) + " time(s).");
	        }
	}

}
