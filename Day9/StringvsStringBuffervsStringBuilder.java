package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable - cannot change value of string
		/*String s="Welcome";
		s.concat("to java");
		System.out.println(s);  // O/P- Welcome. cannot change original value
		*/
		
		//StringBuffer  -mutable - 
		/*StringBuffer sb= new StringBuffer("Welcome");
		sb.append("to java");
		System.out.println(sb); // Welcometo java - can change original value
		*/
		
		//StringBuilder  -mutable
		StringBuilder sbr= new StringBuilder("Welcome");
		sbr.append("to java");
		System.out.println(sbr); // Welcometo java - can change original value
		
	}

}
