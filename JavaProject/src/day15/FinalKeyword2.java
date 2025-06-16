package day15;

final class Test1
{
	final void m()
	{
		System.out.println("This is m method from Test1");
	}

}

class Test2 extends Test1   // cant create child class of final class 
{
	void m()  // cant override final method
	{
		System.out.println("This is m method from Test2");
	}
}



public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
