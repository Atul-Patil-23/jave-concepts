package day7;

public class MinNumberInArray {

	public static void main(String[] args) {
		int a[]= {10,70,30,4};
		int min=a[0];
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max number:"+min);

	}

	}


