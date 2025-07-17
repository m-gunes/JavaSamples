package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.*;

class App {
    public static void main(String[] args)
    {
        ArrayList texts = new ArrayList();
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("Input a number:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0) break;

            String text = StringUtil.generateRandomTextTR(random, n);
            texts.add(text);
        }

        System.out.println();

        for (Object o: texts) {
            String text = (String)o;
            System.out.println(text);
        }

        System.out.println("--------------------------------------");
        if (random.nextBoolean())
            texts.clear();

        System.out.println(texts.isEmpty() ? "Empty" : "Not Empty");

//        String oldText = (String) texts.set(3, "zonguldak");
//        String oldText = (String) texts.remove(3);
//
//        for (Object o: texts) {
//            String text = (String)o;
//            System.out.println(text);
//        }
//
//        System.out.printf("Old Text: %s%n", oldText);
    }
}