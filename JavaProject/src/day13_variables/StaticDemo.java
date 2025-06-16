package day13_variables;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StaticDemo {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		int b=30;
		System.out.println("This is m1 static method..");
		System.out.println(b);
	}	
	
	void m2()
	{
		System.out.println("This is  m2 non static method..");
	}
	
	
	// non static method can access everything directly
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
}

	/*	public static void main(String[] args) {

		// static methods can access static method/variables directly (without object)
		System.out.println(a);
		m1();
		
		// static methods can access non static method/variables through object
		StaticDemo sd=new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
		sd.m();
		
	}

} */
