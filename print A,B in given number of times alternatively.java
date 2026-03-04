-Write a program to print A,B in given number of times alternatively

import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a=Sc.nextInt();
        int b=a;
        int c=0;
        if(a==b)
        {
            for(int i=1;i<=b;i++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(",");
                }
                System.out.print("A");
                System.out.print(",");
                System.out.print("B");
            }
        }
    }
}
