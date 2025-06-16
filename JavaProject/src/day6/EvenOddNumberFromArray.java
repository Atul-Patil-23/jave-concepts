package day6;

public class EvenOddNumberFromArray {

	public static void main(String[] args) {
		int a[]= {3,4,6,8,7,9,2,1};
		int even_count=0;
		int odd_count=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==0)
			{
				even_count++;			
			}
			else
			{
				odd_count++;
			}
			
		}
		System.out.println("even count:"+even_count);
		System.out.println("odd count:"+odd_count);
	}

}
