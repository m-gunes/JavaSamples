package org.csystem.app.string.join;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinWithTwoHyphenApp {
    public static void runCompact()
    {
        ArrayList<String> texts = new ArrayList<>();
        String s;

        while (!(s = Console.readString("Input a text:")).equals("exit"))
            texts.add(s);

        String str = StringUtil.join(texts, "--");

        Console.writeLine("(%s)", str);
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        ArrayList texts = new ArrayList();

        while (true) {
            System.out.print("Input a text:");
            String s = kb.nextLine();

            if ("exit".equals(s))
                break;

            texts.add(s);
        }

        String str = StringUtil.join(texts, "--");
        System.out.printf("(%s)%n", str);

    }

    public static void main(String[] args)
    {
        runCompact();
    }
}
