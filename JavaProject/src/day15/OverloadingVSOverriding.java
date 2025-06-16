package day15;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)  // overriding
	{
		System.out.println(a*a);  // here only implementation is changed
	}
	
	void m2(int a,int b) // overloading
	{
		System.out.println(a+b);
	}
}


public class OverloadingVSOverriding {

	public static void main(String[] args) {
		XYZ xyz=new XYZ();
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(10,20);

		ABC abc=new ABC();
		abc.m1(10);
		abc.m2(50);
				
	}

}
