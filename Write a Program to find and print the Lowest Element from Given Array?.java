import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n<=0)
        {
            System.out.print("Invalid Array Size.");
            return;
        }
        
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min = a[i];
            }
        }
        
        System.out.print(min+" ");
    }
}
