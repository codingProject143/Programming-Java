import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void printSumOfNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int sum = n * (n + 1) / 2; 
      
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printSumOfNaturalNumbers();
    }
}
