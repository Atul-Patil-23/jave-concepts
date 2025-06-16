package day12_polymorphism_encapsulation;

public class Box_constructor_overloading {
	
	double width, height, depth;
	
	Box_constructor_overloading()  // 1st constructor
	{
		 width=height=depth=0;
	}
	
	Box_constructor_overloading(double w, double h, double d)  // 2nd constructor
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box_constructor_overloading(double len)  //// 3rd constructor
	{
		width=height=depth=len;
	}
	
	void volumn()
	{
		 System.out.println(width*height*depth);
	}

}
