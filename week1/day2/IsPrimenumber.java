package week1.day2;

public class IsPrimenumber {
	
	    public static void main(String[] args) {
	        // Declare the number
	        int number = 13;
	        
	        // Check if the number is prime or not
	        boolean isPrime = true;

	        // Check for factors of the number (except 1 and the number itself)
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        // Output the result to the console
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}


