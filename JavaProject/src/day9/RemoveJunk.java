package day9;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="$^& Testing )(*&^%java%^&and!@#$%seleni*&^%um";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);

	}

}
