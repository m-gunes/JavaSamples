package org.csystem.homework.eighth;

import java.util.Scanner;

import static org.csystem.util.string.StringUtil.isPangramEN;
import static org.csystem.util.string.StringUtil.isPangramTR;

/*
Pijamalı hasta yağız şoföre çabucak güvendi. xxxxxxxxxxxxx mmmm Pijamalı hasta yağız şoföre çabucak güvendi.

The quick brown fox jumps over the lazy dog. yağız şoföre çabucak. The quick brown fox jumps over the lazy dog.
*/

public class Homework_8_7 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string:");
        String s = kb.nextLine();

        System.out.printf("TR First pangram is : %s%n", StringUtil1.getFirstPangramTR(s));
        System.out.printf("TR Last pangram is : %s%n", StringUtil1.getLastPangramTR(s));

        System.out.printf("EN First pangram is : %s%n", StringUtil1.getFirstPangramEN(s));
        System.out.printf("EN Last pangram is : %s%n", StringUtil1.getLastPangramEN(s));
    }

    public static void main(String[] args)
    {
        run();
    }
}

class StringUtil1 {

    public static String getFirstPangramTR(String s)
    {
        int origin = 0;
        int bound = s.length() - 1;

        for (; isPangramTR(s.substring(origin, bound)); --bound)
            ;

        for (; isPangramTR(s.substring(origin, bound+1)); ++origin)
            ;

        return s.substring(origin - 1, bound + 1);
    }

    public static String getLastPangramTR(String s)
    {
        int origin = 0;
        int bound = s.length() - 1;

        for (; isPangramTR(s.substring(origin, bound)); ++origin)
            ;

        for (; isPangramTR(s.substring(origin - 1 , bound)); --bound)
            ;

        return s.substring(origin - 1, bound + 1);
    }

    public static String getFirstPangramEN(String s)
    {
        int origin = 0;
        int bound = s.length() - 1;

        for (; isPangramEN(s.substring(origin, bound)); --bound)
            ;

        for (; isPangramEN(s.substring(origin, bound+1)); ++origin)
            ;

        return s.substring(origin - 1, bound + 1);
    }

    public static String getLastPangramEN(String s)
    {
        int origin = 0;
        int bound = s.length() - 1;

        for (; isPangramEN(s.substring(origin, bound)); ++origin)
            ;

        for (; isPangramEN(s.substring(origin - 1 , bound)); --bound)
            ;

        return s.substring(origin - 1, bound + 1);
    }

}
