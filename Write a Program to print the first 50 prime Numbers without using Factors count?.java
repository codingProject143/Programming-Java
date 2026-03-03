import java.util.Scanner;

public class FirstNPrimes {
    public static void printFirstNPrimes() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input value N
        int N = scanner.nextInt();
        
        // Check for invalid input
        if (N <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        
        int count = 0;  // Count of primes found
        int num = 2;    // Current number to check
        
        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num);
                count++;
                // Print comma if not the last prime
                if (count < N) {
                    System.out.print(", ");
                }
            }
            num++;
        }
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Do not change the code below
    public static void main(String[] args) {
        printFirstNPrimes();
    }
}
