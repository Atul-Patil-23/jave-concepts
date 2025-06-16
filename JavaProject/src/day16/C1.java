package day16;

// Here first extends keywords with multiple implements keyword
public class C1 extends C2 implements Interface1,Interface2 
{
	public void m1()
	{
		System.out.println(x);
	}

	public void m2()
	{
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		C1 c1obj=new C1();
		c1obj.m1();
		c1obj.m2();
		c1obj.m3();
		
		
	}

}
