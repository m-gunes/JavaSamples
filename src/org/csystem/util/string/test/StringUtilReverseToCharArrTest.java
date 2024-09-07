package org.csystem.util.string.test;

import java.util.Scanner;

import static org.csystem.util.string.StringUtil.reverseToCharArr;

public class StringUtilReverseToCharArrTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("Input a text: ");
            String s = kb.nextLine();
            if ("quit".equals(s))
                break;

            char[] reverseText = reverseToCharArr(s);
            System.out.printf("Reverse text: %s%n", new String(reverseText));
            System.out.printf("Reverse text: %s%n", String.valueOf(reverseText));
        }
    }
}
