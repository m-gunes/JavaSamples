package org.csystem.homework.eighth;

import java.util.Scanner;

public class Homework_8_4 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string:");
        String s1 = kb.nextLine();
        System.out.print("Input another string:");
        String s2 = kb.nextLine();
        System.out.printf("%s", StringUtil.squeeze(s1, s2));
    }

    public static void main(String [] args)
    {
        run();
    }
}


class StringUtil {
    public static String squeeze(String s1, String s2)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); ++i)
            if(s2.indexOf(s1.charAt(i)) == -1)
                sb.append(s1.charAt(i));

        return sb.toString();
    }
}
