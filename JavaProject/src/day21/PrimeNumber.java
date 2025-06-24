package day21;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 10; 
        boolean isPrime = true;
        for (int i = 2; i < number; i++) 
        {
            if (number % i == 0) 
            {
                    isPrime = false;
                    break;
             }
        }

        // Output the result
        if (isPrime) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }

	}

}
