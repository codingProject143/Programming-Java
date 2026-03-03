import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // If either input is zero
        if (n1 == 0 || n2 == 0)
        {
            System.out.println("Invalid Inputs.");
            return;
        }

        // Convert negative to positive
        if (n1 < 0)
        {
            n1 = -n1;
        }

        if (n2 < 0)
        {
            n2 = -n2;
        }

        // Arrange range properly
        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);

        int count = 0;
        int altCount = 0;
        double sum = 0;
        String numbers = "";

        for (int i = start; i <= end; i++)
        {
            int temp = i;
            int digits = 0;

            while (temp > 0)
            {
                digits++;
                temp /= 10;
            }

            temp = i;
            int armstrongSum = 0;

            while (temp > 0)
            {
                int digit = temp % 10;
                armstrongSum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (armstrongSum == i)
            {
                count++;

                // Alternative Armstrong (odd position)
                if (count % 2 != 0)
                {
                    sum += i;
                    altCount++;

                    if (numbers.equals(""))
                    {
                        numbers = numbers + i;
                    }
                    else
                    {
                        numbers = numbers + " + " + i;
                    }
                }
            }
        }

        if (altCount == 0)
        {
            System.out.println("No Armstrong Numbers in a Given Range");
        }
        else
        {
            double average = sum / altCount;

            System.out.printf(
                "Average of Alternative Armstrong Numbers in the Given Range is ( %s ) / %d = %.2f",
                numbers, altCount, average
            );
        }
    }
}
