package day9;

public class StringComparision {

	public static void main(String[] args) {
		
		//Case 1
		/*String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1==s2);  // true
		System.out.println(s1.equals(s2)); // true
		*/
		
		//Case2
		/*String s11=new String("Welcome");
		String s21=new String("Welcome");
		
		System.out.println(s11==s21); // to compare object - false
		System.out.println(s11.equals(s21));  // to compare values of object - true
		*/
		
		//Case 3
		/*String s10="Welcome";
		String s20=new String("Welcome");
		
		System.out.println(s10==s20); // false
		System.out.println(s10.equals(s20)); // true.
	    */
		
		//Case 4
		String s1="Welcome";
		String s2=new String("Welcome");
		String s3=s2;
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));// true
		
		System.out.println(s2==s3); //true  bacaz objects are same
		System.out.println(s2.equals(s3)); // true
		
		System.out.println(s1==s3); // false
		System.out.println(s1.equals(s3)); //true
	
	}
	
	
	

}
