package day12_polymorphism_encapsulation;

public class Addermain {

	public static void main(String[] args) {
		Adder addobj=new Adder();
		addobj.sum(); //1
		addobj.sum(12, 23); //2 
		addobj.sum( 12, 21.7); //3
		addobj.sum( 12.3, 45); // 4
		addobj.sum(12, 22, 11);
	}

}
