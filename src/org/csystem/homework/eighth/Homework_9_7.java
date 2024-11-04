package org.csystem.homework.eighth;

import java.util.Scanner;

import static org.csystem.util.string.StringUtil.isPangramTR;

/*

Pijamalı hasta yağız şoföre çabucak güvendi. surada xxx baska seyler felan. Pijamalı hasta yağız şoföre çabucak güvendi.
mustafa Pijamalı hasta yağız şoföre çabucak güvendi. surada xxx baska seyler felan. Pijamalı hasta yağız şoföre çabucak güvendi.pijamali hasta yagiz sofore hemende gunvendi
endi.pijamali hasta yagiz sofore hemende gunvendi
Pijamalı hasta yağız şoföre çabucak güvendi. xxxxxxxxxxxxx mmmm Pijamalı hasta yağız şoföre çabucak güvendi.
*/

public class Homework_9_7 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string:");
        String s = kb.nextLine();
        System.out.printf("First pangram is : %s%n", StringUtil1.getFirstPangramTR(s));
        System.out.printf("Last pangram is : %s%n", StringUtil1.getLastPangramTR(s));
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
        int bound = s.length();

        for (; bound > origin && isPangramTR(s.substring(origin, bound)); --bound)
            ;

        for (; origin < bound && isPangramTR(s.substring(origin, bound+1)); ++origin)
            ;

        return s.substring(origin - 1, bound + 1);
    }

    public static String getLastPangramTR(String s)
    {
        int origin = 0;
        int bound = s.length();

        for (; origin < bound && isPangramTR(s.substring(origin, bound)); ++origin)
            ;

        for (; bound > origin && isPangramTR(s.substring(origin - 1 , bound)); --bound)
            ;

        return s.substring(origin - 1, bound + 1);
    }

}