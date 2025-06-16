package day14;

class X
{
	
}

class Y
{
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		X xobj=new X();
		xobj.equals(xobj); 
		
		Y yobj=new Y();
		yobj.equals(yobj);  // method is same as class X
	}

}
