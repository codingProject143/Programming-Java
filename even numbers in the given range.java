-- Write a program to find the count of the even numbers in the given range. If there are no even numbers, then print "NO NUMBERS". If the starting number is greater than the ending number, print "INVALID RANGE".
Constraints:
Input :                First line of input contains Integer n represent staring number.

                           Second line of input contains Integer n1 represent ending number.

Output :             Print the Count of All the even Numbers in the Given Range.

 


Example:
Input :      10, 20
output : 20
*/

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = 0;
        if(a>b || b<a)
        {
            System.out.print("INVALID RANGE");
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                if(i%2==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print("NO NUMBERS");
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
