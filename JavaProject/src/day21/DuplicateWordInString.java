package day21;

public class DuplicateWordInString {

	public static void main(String[] args) {
	       String sentence = "Java is easy and Java is powerful";

	        // Convert the sentence to lowercase and split into words
	        String[] words = sentence.toLowerCase().split(" ");

	        System.out.println("Duplicate words in the string:");

	        // Mark checked words
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals("0")) continue;

	            int count = 1;
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                    words[j] = "0"; // Mark duplicate
	                }
	            }

	            if (count > 1) {
	                System.out.println(words[i] + " appears " + count + " times");
	            }
	        }

	}

}
