package day21;

public class DuplicateCharactersUsingtoCharArrayInString {

	public static void main(String[] args) {
		 String word = "successes";

	        // Convert string to char array
	        char[] c = word.toCharArray();

	        System.out.println("Duplicate characters:");

	        // Loop through characters
	        for (int i = 0; i<c.length; i++) {
	            int count = 1;
	            if (c[i] != '0') {
	                for (int j = i + 1; j<c.length; j++) {
	                    if (c[i] == c[j]) 
	                    {
	                        count++;
	                        c[j] = '0'; // Mark as counted
	                    }
	                }
	                if (count > 1) {
	                    System.out.println(c[i] + " appears " + count + " times");
	                }
	            }
	        }


	}

}
