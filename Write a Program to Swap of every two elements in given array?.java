import java.util.*;

public class SwapPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int n = sc.nextInt();

      
        if (n <= 1 || n >=10) {
            System.out.println("Invalid Array Size.");
            System.exit(0);
        }

       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Swapping - ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }System.out.println();
      
        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.print("After Swappinng - ");
      
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
