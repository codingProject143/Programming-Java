import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 6) {
                System.out.println("Invalid Array Size");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Size");
            return;
        }
        
      
        int[] arr = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid Array Elements");
            return;
        }
       
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
    
        int maxFrequency = 0;
        int mostRepeatedNumber = -1;
        boolean hasDuplicates = false;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostRepeatedNumber = entry.getKey();
            }
            if (entry.getValue() > 1) {
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("NO such number exists");
        } else {
            System.out.println(mostRepeatedNumber);
        }
    }
}
