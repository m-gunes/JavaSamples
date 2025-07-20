package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.*;

class App {
    public static void main(String[] args)
    {
        Vector texts = new Vector();
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
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

        texts.trimToSize();
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

        texts.clear();
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

        texts.trimToSize();
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());
    }
}