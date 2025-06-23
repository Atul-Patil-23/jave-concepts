

package day2;

public class Data_Types {

	public static void main(String[] args) {
		// byte, short, int, long, float, double, char, boolean , String 
		
		//number without decimal
		
		int a=100, b=200,c=300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("sum of:"+(a+b+c));
	
		
		byte by= 123;
		System.out.println("value of by is:"+by);
		
		short sh= 1234;
		System.out.println("value of sh is:"+sh);
		
		
		long l=1234567823462436236L;  // literal is needed  L/l
		System.out.println("value of l is:"+l);
		
		//Decimal numbers  - float double
		float fl=13.4F; // literal is needed
		System.out.println("value of fl is:"+fl);
		
		double dbl=12.2345;
		System.out.println("value if dbl is:"+dbl);
		
		
		char grad='A';
		System.out.println("value if grade is:"+grad );
		
		String name = "Atul";
		System.out.println("value of string name is:"+ name);
		
		
		// String str='atul';  Invalid as name is in single quote
		// char a='as'   - Invalid
		
		
		boolean bl=true;
		System.out.println("value of bl is:"+bl);
		
		String str="A";
	}

}
