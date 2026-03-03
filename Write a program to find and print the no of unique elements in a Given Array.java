import java.util.Scanner;
import java.util.HashMap;

public class UniqueElementsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid Array Size.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Size.");
            return;
        }
        
        
        int[] arr = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Elements.");
            return;
        }
        
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
      
        int uniqueCount = 0;
        for (int count : frequencyMap.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }
        
       
        if (uniqueCount == 0) {
            System.out.println("No Unique Elements");
        } else {
            System.out.println(uniqueCount);
        }
    }
}
