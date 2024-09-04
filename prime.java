import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check if both numbers are prime
        boolean isNum1Prime = isPrime(num1);
        boolean isNum2Prime = isPrime(num2);

        // Output the results
        if (isNum1Prime) {
            System.out.println(num1 + " is a prime number.");
        } else {
            System.out.println(num1 + " is not a prime number.");
        }

        if (isNum2Prime) {
            System.out.println(num2 + " is a prime number.");
        } else {
            System.out.println(num2 + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}
