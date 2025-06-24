package day21;

import java.util.HashSet;

public class DuplicateCharInStringElement {

	public static void main(String[] args) {
		 String word = "programming";

	        // Convert to lowercase for case-insensitive comparison (optional)
	        word = word.toLowerCase();

	        HashSet<Character> seen = new HashSet<>();
	        HashSet<Character> duplicates = new HashSet<>();

	        for (char ch : word.toCharArray()) 
	        {
	        	
	        /*	seen.add(ch) tries to add ch to the seen set.
	        	If ch was already in the set, add(ch) returns false.
	        	In that case, it’s a duplicate, so it’s added to the duplicates set.
	        	*/
	        	
	            if (!seen.add(ch)) {
	                duplicates.add(ch);
	            }
	        }

	        // Output result
	        if (duplicates.isEmpty()) 
	        {
	            System.out.println("No duplicate characters found.");
	        } 
	        else 
	        {
	            System.out.println("Duplicate characters:");
	            for (char ch : duplicates) {
	                System.out.println(ch);
	            }
	        }

	}

}
