package day21;

import java.util.Arrays;

public class CheckTwoArrayEqual {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,6};
		
		
		// Appproach 1
		System.out.println("Is array1 equal to array2:"+Arrays.equals(a, b));
		

		// Apprach 2
		
		boolean status=true;
		for(int i=0; i<a.length; i++)
		{
			if(a.length==b.length)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
				else 
				{
					status=true;
				}
			}
			else
			{
				status=false;
			}
		}
		
		
		if(status==true)
		{
			System.out.println("Both arrays are equal");
		}
		
		else {
			System.out.println("arrays are not equal");
		}
		
	}

}
