package day6;

public class MultiDimentionalArray {
	public static void main(String[] args) {
		
		//Appraoch 1
		/*int a[][]=new int[3][2];
		a[0][1]=100;
		*/
		
		//Approach 2
		int a[][]= {{100,200},{300,400},{500,600},{765,567}};
		//System.out.println("number of rows:"+a.length);
		//System.out.println("number of columns:"+a[0].length);
		//System.out.println(a[0][1]);
		
		//normal for loop
		/*for(int r=0; r<=a.length-1; r++)  // this is for number of rows in array
		{
			for(int c=0; c<=a[0].length-1; c++) // this is for number of rows in columns
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}*/
		
		//using for..each loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println(); // this is used to print output in table format
			
		}
	}
}
