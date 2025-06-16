package day5;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i==6)   // here condition is true. so from 6 onwards, values will not print
			{
				break;			
			}
			System.out.println(i);
		
			
		}
	}

}
