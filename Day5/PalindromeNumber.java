package day5;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=12321;
		int org_num=num;
		int rev = 0;
		while(num>0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("reverse number:"+ rev);
		if(rev==org_num)
		{
			System.out.println(org_num + " is paindrome");
		}
		else {
			System.out.println(org_num + "not paindrome");
		}
		
		
	}

}
