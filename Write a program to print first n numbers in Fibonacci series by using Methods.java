import java.util.Scanner;

public class FibonacciPrinter {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("Invalid InPut");
        } else {
            printFibonacci(Math.abs(n));  // Convert negative to positive
        }
        sc.close();
    }
    
   
    public static void printFibonacci(int count) {
        if (count <= 0) return;
        
        int n1 = 0, n2 = 1;
        StringBuilder result = new StringBuilder();
        
        
        result.append(n1);
        
        if (count >= 2) {
            result.append(", ").append(n2);
        }
        
        for (int i = 3; i <= count; i++) {
            int n3 = n1 + n2;
            result.append(", ").append(n3);
            n1 = n2;
            n2 = n3;
        }
        
        
        result.append(".");
        System.out.println(result);
    }
}
