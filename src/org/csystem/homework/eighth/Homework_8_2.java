package org.csystem.homework.eighth;

import java.util.Scanner;

public class Homework_8_2 {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir yazi giriniz: ");
        String s = kb.nextLine();

        for(int i = 1; i <= s.length(); ++i)
            System.out.println(s.substring(0, i));
    }

    public static void main(String[] args)
    {
        run();
    }
}
