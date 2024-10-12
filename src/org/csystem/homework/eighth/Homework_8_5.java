package org.csystem.homework.eighth;

import java.util.Scanner;

public class Homework_8_5 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("Input a variable name:");
            String s = kb.nextLine();
            if(s.equals("exit"))
                break;
            System.out.println(StringUtil2.isIdentifier(s));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}

class StringUtil2 {
    public static boolean isIdentifier(String s)
    {
        return !s.isEmpty() && !s.isBlank() && !Character.isDigit(s.charAt(0)) && (s.charAt(0) != '_' || s.length() != 1) && !isContainWhitespace(s);
    }

    public static boolean isContainWhitespace(String s)
    {
        for (int i = 0; i < s.length(); ++i)
            if(Character.isWhitespace(s.charAt(i)))
                return true;
        return false;
    }
}