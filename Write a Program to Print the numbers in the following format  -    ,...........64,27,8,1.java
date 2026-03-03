import java.util.Scanner;

public class CubeSeries {
    public static void printCubeSeries() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input value n
        int n = scanner.nextInt();
        
        // Check for invalid input
        if (n == 0) {
            System.out.println("Invalid Input.");
            return;
        }
        
        // Handle negative input by converting to positive
        n = Math.abs(n);
        
        // Build the series string
        StringBuilder series = new StringBuilder("");
        for (int i = n; i >= 1; i--) {
            int cube = i * i * i;
            series.append(cube);
            if (i > 1) {
                series.append(", ");
            }
        }
        series.append(".");
        
        // Print the result
        System.out.println(series.toString());
    }

    public static void main(String[] args) {
        printCubeSeries();
    }
}
