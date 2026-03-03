--write a Program to Print the Alternative Even Numbers Between the Given Numbers?

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
            int a=Sc.nextInt();
            int b=Sc.nextInt();
            int c=0;
            if(a>0 && b>a)
            {
               for(int i=a+1;i<b;i++)
               {
                   if(i%2==0)
                   {
                       c++;
                       if(c%2==1)
                       {
                           System.out.print(i+" ");
                       }
                   }
               }
            }
            else
            {
                System.out.print("Invalid Inputs");   
            }
    }
}
