package dailyWarmup;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args)
    {
        System.out.println("Enter the value of rows and columns for the pattern: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if((number >= 1) && (number <= 20))
        {
            for(int i=1; i<=number; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("Please provide a number greater than 1 and less than or equal to 20");
    }
}
