package dailyWarmup;

import java.util.Scanner;

public class checkDay {
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day)
        {
            case 1: System.out.println("it is Monday");
            break;
            case 2: System.out.println("it is Tuesday");
            break;
            case 3: System.out.println("it is Wednesay");
            break;
            case 4: System.out.println("it is Thursday");
            break;
            case 5: System.out.println("it is Friday");
            break;
            case 6: System.out.println("it is Saturday");
            break;
            case 7: System.out.println("it is Sunday");
            break;
            default: System.out.println("Enter a number which is not less than 1 or greater than 7");
            break;
        }
    }
}
