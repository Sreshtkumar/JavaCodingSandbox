package dailyWarmup;

import java.util.Scanner;

public class lastStringChar {
    public static void main(String[] args)
    {
        System.out.println("Enter the string you want to get a last character from: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = getLastChar(str);
        if(c != ' ')
        System.out.println(c);
        else
            System.out.println("Please check the string length and case");
    }

    public static char getLastChar(String s)
    {
        if((s.equals(s.toLowerCase())) && ((s.length() >= 1) && (s.length()<=100)))
            return s.charAt(s.length()-1);
        else
            return ' ';
    }
}
