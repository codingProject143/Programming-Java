Write program to print the following series which is shown in Given Examples.
Constraints:
Input          :- First Line of Input Consists of One Integer Value.
                     Second Line of Input Consists of One Integer Value.
Output        :- Print the Following Series.
Constraints  :- No 

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a>b)
        {
            for(int i=a;i>=b;i--)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                if(i>=0)
                {
                    System.out.print("5*"+i);
                }
                else
                {
                    System.out.print("5*("+i+")");
                }
            }
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                c++;
                if(c!=1)
                {
                System.out.print(", ");
                }
                if(i>=0)
                {
                System.out.print("5*"+i);
                }
                else
                {
                System.out.print("5*("+i+")");
                }
            }
        }
    }
}
    
