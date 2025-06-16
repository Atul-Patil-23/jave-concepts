package day11;

public class ConstructorDemo {
	
	int x,y;  // class variables
	
	// Default constructor
	/*ConstructorDemo()
	{
		x=100;
		y=200;
	}
	*/
	
	// parameterized constructor
	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo(10,20);
		cd.sum();
		
	}

}
