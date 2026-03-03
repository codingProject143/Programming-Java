import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;

public class LeastUniqueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 5) {
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
        
       
        TreeSet<Integer> uniqueNumbers = new TreeSet<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                uniqueNumbers.add(num);
            }
        }
        
        
        if (uniqueNumbers.isEmpty()) {
            System.out.println("No Uniques in the Array");
        } else {
            System.out.println(uniqueNumbers.first()); // Gets the smallest unique number
        }
    }
}
