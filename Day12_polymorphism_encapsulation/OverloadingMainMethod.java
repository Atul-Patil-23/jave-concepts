package day12_polymorphism_encapsulation;

public class OverloadingMainMethod {
	
	//we can overload main method

	void main(int x)
	{
		System.out.println(x);
	}
	
	void main(String str)
	{
		System.out.println(str);
	}
	
	void  main(String str, String s)
	{
	
		//return (str+s);
		System.out.println((str+s));
	}
	
	public static void main(String[] args) {
		OverloadingMainMethod ov=new OverloadingMainMethod();
		ov.main(10);
		ov.main("Atul");
		ov.main("Atul"+" "+"Patil");
	}

}
