import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        int count=0;
        
        if(n1<0 || n2<0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            if(n1>n2)
            {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            
            while(a<=n2)
            {
                if(a>=n1)
                {
                    sum = sum+a;
                    count++;
                }
                int c = a+b;
                a=b;
                b=c;
            }
            if(count==0)
            {
                System.out.print("No Fibonacci Series Values");
            }
            else
            {
                float avg =(float)sum/count;
                System.out.printf("%.2f",avg);
            }
        }
    }
}
