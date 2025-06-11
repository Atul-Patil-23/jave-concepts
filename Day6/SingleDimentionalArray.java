package day6;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// Declaring array
		
		//Approach 1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		 */
		
		//Approach 2
		/*int a[]= {100,200,300};
		System.out.println(a[2]);
		*/
		
		
		//Find the length of an array
		/*int a[]= {23,34,54,34,56};
		System.out.println("length of an array:"+a.length);
		*/
		
		
		//reading all the values from array
		/*int a[]= {23,34,54,34,56};
		//using normal for look
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
		}*/
		
		
		//enhanced for loop/ for..each loop. for all collections and arrays this loop is used
		int a[]= {23,34,54,34,56};
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
	}

}
