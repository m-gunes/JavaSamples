package org.csystem.homework.seventh;

import java.util.Random;

public class Homework_7_2 {
    public static void main(String[] args)
    {
        printRandomDate();
    }

    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String getDaySuffix(int day)
    {
        return switch (day) {
            case 1, 21, 31 -> "st";
            case 2, 22 -> "nd";
            case 3, 23 -> "rd";
            default -> "th";
        };
    }

    public static String getMonthName(int month)
    {
        return switch (month) {
           case 1 ->  "Jan";
           case 2 ->  "Feb";
           case 3 ->  "Mar";
           case 4 ->  "Apr";
           case 5 ->  "May";
           case 6 ->  "Jun";
           case 7 ->  "Jul";
           case 8 ->  "Aug";
           case 9 ->  "Sep";
           case 10 -> "Oct";
           case 11 -> "Nov";
           default -> "Dec";
        };
    }

    public static void printRandomDate()
    {

        Random r = new Random();
        int month = r.nextInt(1, 13);
        int year = r.nextInt(1900, 2101);

        int boundOfDay = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };

        int day = r.nextInt(1, boundOfDay + 1);

        System.out.printf("%d%s %s %d", day, getDaySuffix(day),  getMonthName(month), year );
    }
}
