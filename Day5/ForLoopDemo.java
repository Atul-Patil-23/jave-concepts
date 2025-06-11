package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
 
		//for loop syntax
		//for (initialization; condition; inc/dec)
		// print 1 to 10 number
		
		/*for(int i=1;i<=10;i++) 
		{
			System.out.println(i);
		}
    	*/
		
		
		//Example 2
		// 1to 10 even numbers
		/*for(int i=2;i<=10;i+=2)
		{
			
			System.out.println(i);
			
		}
		*/
		
		
		//example 3: even and odd number 
		/*for (int i=1;i<=10;i++) 
		{
			if(i%2==0) 
			{
			System.out.println(i+" Even");	
			}
			else 
			{
				System.out.println(i+" odd");
			}
			
		}*/
		
		
		//Example 4: 10 to 1 descending order
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
	}

}
