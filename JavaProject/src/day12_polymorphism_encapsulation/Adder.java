package day12_polymorphism_encapsulation;

public class Adder {
	
	int a=10, b=20;
	
	//1
	void sum()  
	{
		System.out.println(a+b);
	}
	
	//2
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	//3
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	//4
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
	
	//5
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
