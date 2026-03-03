import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vc=0;
        if(n<=0)
        {
            System.out.print("Invalid Array Size.");
        }
        else
        {
            char ch[] = new char[n];
            for(int i=0;i<n;i++)
            {
                ch[i]=sc.next().charAt(0);
            }
            
            for(int i=0;i<n;i++)
            {
                if(!Character.isLetter(ch[i]))
                {
                    System.out.print("Invalid Array Elements.");
                    return;
                }
                else
                {
                    char current = Character.toLowerCase(ch[i]);
                    if(current=='a'|| current=='e'||current=='i'||current=='o'||current=='u')
                    {
                        vc++;
                    }
                }
            }
            if(vc==n)
            {
                System.out.print("No consonants found.");
            }
            else
            {
                System.out.print(n-vc);
            }
        }
    }
}
