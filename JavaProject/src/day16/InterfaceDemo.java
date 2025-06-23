package day16;

interface Shape
{
	// Interface contains variables and methods
	// Variable inside interface is static and final 
	int length=10;   
	int width=20;
	
	void circle();  // abstract method. This method doesn't have implementation
	
	default void square()
	{
		System.out.println("This is square...default method inside interface");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle....static method inside interface");
	}

}

public class InterfaceDemo implements Shape {
	public void circle() // all method are public in interface
	{
		System.out.println("This is circle...abstract class");
	}
	
	 static void m()
	{
		System.out.println("This is static method inside the class");
	}
	 
	 public void square()
		{
			System.out.println("This is square...public method inside interface");
		}

	
	public static void main(String[] args) {
		
		//Scenario 1
		InterfaceDemo id=new InterfaceDemo();	// Object of class
		id.circle();  // Abstract method
		id.square();  // default method
		m();          // Static method inside class which does not required an object to specify
		Shape.rectangle(); // static method can directly access from interface
		
		//Scenario 2
		Shape sh=new InterfaceDemo();
		//Shape sh - can create object reference of interface
		//new InterfaceDemo()  - we cannot create instance of interface. here we created instance of class
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}

}
