package org.csystem.datetime;

import java.util.Random;
import java.util.Scanner;

public class DatetimeApp {
    public static void main(String[] args)
    {
        compareTo();
    }

    /**
     * Bir enum sınıfının compareTo metodu <pre>{@code a.compareTo(b)}</pre> çağrısı için
     * <pre>{@code a.ordinal() - b.ordinal()}</pre> değerine geri döner.
     * Bu durumda bu değer negatifse a referansının gösterdiği nesneyi gösteren enum sabiti,
     * b referansının gösterdiği nesneyi gösteren enum sabitinden önce gelir, sıfırsa aynı sabitlerdir, pozitifse sonra gelir.
     */
    public static void compareTo()
    {
        Random random = new Random();
        Month [] months = Month.values();
        Month month1 = months[random.nextInt(months.length)];
        Month month2 = months[random.nextInt(months.length)];

        int diff = month1.compareTo(month2);

        if (diff > 0)
            System.out.printf("%s ve %s arasında %d ay vardır%n", month2.toString(), month1.toString(), diff);
        else if (diff == 0)
            System.out.printf("%s ve %s aynı aylardır", month1.toString(), month2.toString());
        else
            System.out.printf("%s ve %s arasında %d ay vardır%n", month1.toString(), month2.toString(), -diff);
    }

    /**
     * enum referansları == veya != operatörü ile karşılaştırıldığında aslında mantıksal olarak eşitlik karşılaştırması da yapılmış olur.
     * Yani referans karşılaştırma çoğu zaman mantıksal eşitlik karşılaştırması olarak da kullanılabilir.
     * Eşitlik karşılaştırması ayrıca equals metodu ile de yapılabillir.
     */
    public static void isMonthEqual()
    {
        Random random = new Random();
        Month [] months = Month.values();
        Month month1 = months[random.nextInt(months.length)];
        Month month2 = months[random.nextInt(months.length)];

        System.out.printf("month1 = %s, month2 = %s%n", month1.toString(), month2.toString());
        System.out.println(month1 == month2 ? "Same month" :  "Different month");
        System.out.println(month1 != month2 ? "Different month" : "Same month");
    }

    /**
        Bir enum sınıfının valueOf static metodu parametresi ile aldığı yazıyla aynı isimde enum sabiti varsa
        o sabite ilişkin referansa geri döner. Yoksa exception oluşur:
     */
    public static void printGetDaysWithValueOf()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Input month as JAN, FEB, ..., DEC:");
        Month month = Month.valueOf(kb.nextLine());
        int year = random.nextInt(1900, 2101);

        System.out.printf("%d -> %s(%d)%n", year, month.toString(), month.getDays(year));
    }

    public static void printGetDays()
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
