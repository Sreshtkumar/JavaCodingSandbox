package dailyWarmup;

import java.util.Scanner;

public class printXNTimes {
    public static void main(String[] args) {
        System.out.println("Enter the number to print, and how many times you want to print it: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = sc.nextInt();
        if (((num >= -100) && (num <= 100)) && ((count >= 0) && (count <= 100))) {
            for (int i = 0; i < count; i++) {
                System.out.print(num + " ");
            }
        } else {
            System.out.print("Enter a correct number ");
        }
        System.out.println();
    }
}
