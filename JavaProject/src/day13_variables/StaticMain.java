package day13_variables;

public class StaticMain {

	public static void main(String[] args) {

		// Here we created separate class and inside that class we have main method.
		// So if we have to use static variables or method from another class, then add class name explicity
		 
		System.out.println(StaticDemo.a); // here StaticDemo is class name
		StaticDemo.m1();
		
		// non static methods can access static method/variables through object
		StaticDemo sd=new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
		
		sd.m();

	}

}
