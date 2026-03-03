import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;
	    
	    if(n<=1 || n>=10)
	    {
	        System.out.print("Invalid Array Size.");
	       
	    }
	    else
	    {int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]%2==0)
	            {
	                if(count%2==0)
	                {
	                    System.out.print(arr[i]+" ");
	                }
	                count++;
	            }
	        }
	        
	        if(count ==0)
	        {
	            System.out.print("No even numbers in the give Array!");
	        }
	    }
		//Write your code here.
	}
}
