package day21;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInString {

	public static void main(String[] args) {
		 String text = "Java is simple and Java is powerful";

	        // Convert string to lowercase and split into words
	        String[] words = text.toLowerCase().split(" ");

	        // Map to store word counts
	        Map<String, Integer> wordCount = new HashMap<>();

	        // Count each word
	        for (String word : words) 
	        {
	            if (wordCount.containsKey(word)) 
	            {
	                wordCount.put(word, wordCount.get(word) + 1);
	            } 
	            else 
	            {
	                wordCount.put(word, 1);
	            }
	        }

	        // Print duplicate words with count
	        System.out.println("Duplicate words:");
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) 
	        {
	            if (entry.getValue() > 1) 
	            {
	                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
	            }
	        }

	}

}
