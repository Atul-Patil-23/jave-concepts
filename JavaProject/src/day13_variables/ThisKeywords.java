package day13_variables;

public class ThisKeywords {
	
	// This keyword represent class variables
	
	int x,y;
	
	// This keyword using constructor
	ThisKeywords(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	/*// This keyword using method
	void setData(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	*/
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeywords tk=new ThisKeywords(10,20);
		tk.display();

	}

}
