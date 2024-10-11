package org.csystem.homework.eighth;

import java.util.Scanner;

public class Homework_8_3 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir yazi giriniz:");
        String s = kb.nextLine();
        System.out.printf("(%s)", trim(s));
    }

    public static String trim(String s)
    {
        return trimLeading(trimTrailing(s));
    }

    public static String trimLeading(String s)
    {

        int i = 0;
        for (; i < s.length() && Character.isWhitespace(s.charAt(i)); ++i)
            ;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i = s.length() - 1;
        for (; i > 0 && Character.isWhitespace(s.charAt(i)); --i)
            ;

        return s.substring(0, i+1);
    }

    public static void main(String [] args)
    {
        run();
    }
}
