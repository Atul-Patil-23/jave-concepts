package day21;

import java.util.HashMap;
import java.util.Map;

public class CountCharFrequencyInString {

	public static void main(String[] args) {
        String input = "hello worldddd";
        Map<Character, Integer> freqMap = new HashMap<>();

// input.toCharArray() converts the string into a character array: ['h','e','l','l','o',' ','w','o','r','l','d']
        for (char c : input.toCharArray())
        	
/* containsKey(c) checks if the character c is already in the map.
       If it is already there, get the current count (freqMap.get(c)), add 1, and update the value.
       If it isn't there yet, that means it's the first occurrence, so you store it with a value of 1.                	
*/
        {
            if (freqMap.containsKey(c)) 
            {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
