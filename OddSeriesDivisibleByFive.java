/*
Write program to print the following series which is shown in Given Examples.
Constraints:
Input          :- First Line of Input Consists of One Integer Value.
Output        :- Print the Following Series.
Constraints  :- No 
Example:
Input 1  :    25
Output 1:     1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five
Input 2  :    38
Output 2:    1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five, 27, 29, 31, 33, divisible by five, 37import java.util.Scanner;
*/
class main{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++)
        {
           if(i%2==1)
           {
               c++;
               if(c!=1)
               {
                   System.out.print(", ");
               }
              if(i%5==0)
              {
                  System.out.print("divisible by five");
              }
              else
              {
                  System.out.print(i);
              }
              
             
           }
        }
    }
}
       
