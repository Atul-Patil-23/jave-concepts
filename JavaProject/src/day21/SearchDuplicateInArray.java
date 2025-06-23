package day21;

import java.util.HashSet;

public class SearchDuplicateInArray {

	public static void main(String[] args) {
		 // Sample array
        int[] numbers = {4, 2, 7, 4, 8, 2, 5, 9, 7};

        // HashSet to track seen numbers
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Check for duplicates
        for (int num : numbers) {
            if (!seen.add(num)) {
                // Already seen, so it's a duplicate
                duplicates.add(num);
            }
        }

        // Print results
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements found:");
            for (int dup : duplicates) {
                System.out.println(dup);
            }
        }
	}

}
