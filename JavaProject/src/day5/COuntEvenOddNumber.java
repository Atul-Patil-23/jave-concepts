package day5;

public class COuntEvenOddNumber {

	public static void main(String[] args) {
		int num=2189365;
		int even_count = 0;
		int odd_count=0;
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
			
		}
		System.out.println("even count is:" + even_count);
		System.out.println("odd count is:" + odd_count);
	}

}
