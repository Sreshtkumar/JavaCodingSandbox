package dailyWarmup;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args)
    {
        System.out.println("Enter the value of rows and columns for the pattern: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if((number >= 1) && (number <= 20))
        {
            for(int i=number; i>0; i--)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
            System.out.print("Please provide a number greater than 1 and less than or equal to 20");
    }
}
