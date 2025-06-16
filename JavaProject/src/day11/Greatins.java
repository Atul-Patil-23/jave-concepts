package day11;

public class Greatins {
	
	//1) No params  no return value
	
	void m1()
	{
		System.out.println("Hello...");// this sentence is not return anything. Thats why we added return type is void
	}
	
	//2) No params  Return value
	
	String m2()
	{
	return "how are you?"; // This will return string. So return type of m2 method is string	
	}
	
	//3) Takes params  no return value
	void m3(String name, int i)
	{
		System.out.println("Hello"+" "+name+" "+i);
	}
	
	
	//4) Takes params  return value
	String m4(String name)
	{
		return ("Hello"+name); // return keyword should be present to return anything
	}
	
	
	
}
