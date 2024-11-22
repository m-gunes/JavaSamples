package org.csystem.datetime;

import java.util.Random;
import java.util.Scanner;

public class DatetimeApp {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        Month [] months = Month.values();

        System.out.print("Input a number:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            Month month = months[random.nextInt(months.length)];
            int year = random.nextInt(1900, 2101);

            System.out.printf("%d -> %s(%d)%n", year, month.toString(), month.getDays(year));
        }
    }
}
