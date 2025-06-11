package day9;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s="Learn   java  programming";
		System.out.println("Before replace:"+s);
		s.replaceAll("\\s","");
		System.out.println("after replace:"+s);
	}

}
