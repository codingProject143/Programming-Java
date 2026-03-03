import java.util.Scanner;
import java.util.ArrayList;

public class EvenNumbers {
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
       
        if (firstNum <= 0 && secondNum <= 0) {
            System.out.println("Invalid Inputs");
            return;
        } else if (firstNum <= 0) {
            System.out.println("Invalid First Input");
            return;
        } else if (secondNum <= 0) {
            System.out.println("Invalid Second Input");
            return;
        }
        int start = Math.min(firstNum, secondNum);
        int end = Math.max(firstNum, secondNum);
        
        
        ArrayList<String> evenNumbers = new ArrayList<>();
        for (int num = start + 1; num < end; num++) {
            if (num % 2 == 0) {
                evenNumbers.add(String.valueOf(num));
            }
        }
        if (!evenNumbers.isEmpty()) {
            System.out.println(String.join(", ", evenNumbers) + ".");
        } else {
            System.out.println();
        }
    }

    // Do not change the code below
    public static void main(String[] args) {
        printEvenNumbers();
    }
}
