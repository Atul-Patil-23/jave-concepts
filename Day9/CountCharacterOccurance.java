package day9;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s="learn java and pythod language";
		s.length();
		s.replace("a", "").length();
		
		int count = (s.length()) - (s.replace("a", "").length());
		System.out.println(count);
	}

}
