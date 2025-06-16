package day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a=10,b=40,c=30;
		if(a>b && a>c) {
			System.out.println("Largest number is:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is:"+b);
		}
		else{
			System.out.println("Largest number is:"+c);
		}
	}

}
