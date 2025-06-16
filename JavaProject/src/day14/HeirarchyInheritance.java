package day14;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}

}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Child1
{
	void print(int c)
	{
		System.out.println(c);
	}
}



public class HeirarchyInheritance {

	public static void main(String[] args) {
		Child1 ch1=new Child1();
		ch1.display(100);
		ch1.show(200);

		Child2 ch2=new Child2();
		ch2.display(300);
		ch2.show(400);
		ch2.print(500);
	}

}
