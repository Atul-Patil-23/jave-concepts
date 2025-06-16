package day5;

public class CountSumOfAllDigits {

	public static void main(String[] args) {
		int num=23653426;
		int sum=0;
		while(num>0) 
		{
			sum=sum + num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
