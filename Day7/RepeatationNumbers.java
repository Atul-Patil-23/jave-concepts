package day7;

public class RepeatationNumbers {

	public static void main(String[] args) {
		int a[]= {10,20,30,10,40,10};
		int repeat_ele=10;
		int count=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==repeat_ele)
			{
				count++;
			}	
		}
		System.out.println(count);

	}

}
