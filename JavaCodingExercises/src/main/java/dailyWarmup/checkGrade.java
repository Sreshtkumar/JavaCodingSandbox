package dailyWarmup;

import java.util.Scanner;

public class checkGrade {
    public static void main(String[] args)
    {
        System.out.println("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 70 && marks < 90) {
            System.out.println("Grade B");
        }
        else if (marks >= 50 && marks < 70) {
            System.out.println("Grade C");
        }
        else if (marks >= 35 && marks < 50) {
            System.out.println("Grade D");
        }
        else
            System.out.println("Fail");
    }
}
