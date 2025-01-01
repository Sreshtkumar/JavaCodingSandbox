package dailyWarmup;

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args)
    {
        System.out.println("Enter number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] a = new int[numberOfElements];
        int sum = 0;
        for(int i=0; i<numberOfElements; i++)
        {
            System.out.println("Enter an element in the array: ");
            //Scanner scanner = new Scanner(System.in);
            int element = sc.nextInt();
            a[i] = element;
        }
        sum = a[0] + a[a.length - 1];
        System.out.println("sum of first and last elements of the array is: " + sum);
    }
}
