/* Write program to print the following series which is shown in Given Examples.
Constraints:
Input         :-   First Line Of Input consists of One Integer value.
                      Second Line Of Input consists of One Integer value.
Output       :-   Print the Following Series.
Constraints :-   All the Values Should be Greater than Zero or else print "Invalid Inputs".  

Example:
Input 1   : 100
            1000
Output 1 : 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
*/

import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = 0;
        if(a<0 || b<0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=a;i<=b;i+=100)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }    
    }
}
