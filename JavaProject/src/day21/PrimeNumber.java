package day21;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 10; // Change this number to test others
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (number <= 1) 
        {
            isPrime = false;
        }
        else 
        {
            // Check visibility from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

	}

}
