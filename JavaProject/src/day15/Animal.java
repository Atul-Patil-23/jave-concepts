package day15;

public class Animal {
	
	String color="White";
	
	void eat()
	{
		System.out.println("eating..");
	}

}


class Dog extends Animal
{
	String color="black";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		System.out.println("eating bread..");
		super.eat();
	}
}
