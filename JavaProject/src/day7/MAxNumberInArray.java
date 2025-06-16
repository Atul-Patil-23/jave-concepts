package day7;

public class MAxNumberInArray {

	public static void main(String[] args) {
		int a[]= {10,70,30,90};
		int max=a[0];
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max number:"+max);

	}

}
