package day7;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[]={3,5,1,4};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array is:"+sum);
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of array is:"+sum2);
		
		System.out.println("Missing number is:"+(sum2-sum));
	}

}
