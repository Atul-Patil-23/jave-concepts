package day15;

class Bank
{
	double roi()  // - this is called declaration
	{
		return 0;  //  this is called implementation
	}
}

class Hdfc extends Bank
{
	double roi()  // declaration is same
	{
		return 10.2;  // here implementation is changed
	}
}

class Boi extends Bank
{
	double roi()
	{
		return 9.3;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Hdfc hdfc=new Hdfc();
		System.out.println(hdfc.roi()); // 10.2
		
		Boi boi=new Boi();
		System.out.println(boi.roi()); //9.3
		
	}

}
