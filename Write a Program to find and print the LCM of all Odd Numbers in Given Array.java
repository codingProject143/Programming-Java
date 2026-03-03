import java.util.Scanner;

public class OddNumbersLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 0 || size >= 10) {
                System.out.println("Invalid Array Size");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Size");
            return;
        }
        
     
        int[] numbers = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Elements");
            return;
        }
        
    
        int[] oddNumbers = new int[size];
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers[oddCount++] = num;
            }
        }
        
      
        if (oddCount == 0) {
            System.out.println("No Odd Numbers");
            return;
        }
        
        
        int lcm = oddNumbers[0];
        for (int i = 1; i < oddCount; i++) {
            lcm = calculateLCM(lcm, oddNumbers[i]);
        }
        
        System.out.println(lcm);
    }
    
  
    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
    
 
    private static int calculateLCM(int a, int b) {
        return (a / calculateGCD(a, b)) * b;
    }
}
