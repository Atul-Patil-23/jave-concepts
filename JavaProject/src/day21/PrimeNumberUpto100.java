package day21;

public class PrimeNumberUpto100 {

	public static void main(String[] args) {
		 System.out.println("Prime numbers between 1 and 100:");

	        for (int number = 2; number <= 100; number++) 
	        {
	            boolean isPrime = true;

	            // Check visibility from 2 to number - 1
	            for (int i = 2; i < number; i++) 
	            {
	                if (number % i == 0) 
	                {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // Print if prime
	            if (isPrime) 
	            {
	                System.out.print(number + " ");
	            }
	        }

	}

}
