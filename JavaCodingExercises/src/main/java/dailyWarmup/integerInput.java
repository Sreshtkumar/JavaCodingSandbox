package dailyWarmup;

import java.util.Scanner;

public class integerInput {
    public static void main(String[] args)
    {
        System.out.println("Enter the number to print:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the number you have entered is: "+ num);
    }
}
