package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i==6)   // here condition is true. so from 6 onwards, 6 value will skip and rest will print
			{
				continue;			
			}
			System.out.println(i);
		
			
		}
		 

		
		
		
		
		//Example 2:
		/*
		for(int i=1; i<=10; i++)
		{
			if(i==6 || i==2 || i==4)   
			{
				continue;			
			}
			System.out.println(i);
		
			
		}
		*/
		
	}

}
