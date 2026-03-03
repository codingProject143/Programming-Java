import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            int sum=0;
            while(n>0)
            {
                int r=n%10;
                n=n/10;
                sum=sum+r;
            }
            
            System.out.print(sum);
 
        }
    }

}
