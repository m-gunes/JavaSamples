package org.csystem.app.string.join;

import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinWithTwoHyphenApp {
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
        run();
    }
}
