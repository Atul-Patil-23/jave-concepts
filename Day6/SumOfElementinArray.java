package day6;

public class SumOfElementinArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		int sum=0;
		/*for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		*/
		
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println(sum);
	}

}
