import java.util.Scanner;

public class SumOfSquares {
    public static void calculateSumOfSquares() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input value n
        int n = scanner.nextInt();
        
        // Handle negative input by converting to positive
        n = Math.abs(n);
        
        // Check for zero input
        if (n == 0) {
            System.out.println("Invalid Input");
            return;
        }
        
        // Calculate sum of squares
        int sum = 0;
        StringBuilder expression = new StringBuilder(" ");
        
        for (int i = n; i >= 1; i--) {
            int square = i * i;
            sum += square;
            expression.append(square);
            if (i > 1) {
                expression.append(" + ");
            }
        }
        
        // Print the result in required format
        System.out.println(expression.toString() + " = " + sum);
    }

    public static void main(String[] args) {
        calculateSumOfSquares();
    }
}
