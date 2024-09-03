package org.csystem.homework.fifth;

/*----------------------------------------------------------------------------------------------------------------------
	Homework-005-3.sorunun çözümü
-----------------------------------------------------------------------------------------------------------------------*/


public class Homework_5_3 {
    public static void main(String[] args)
    {
        areFriendsTestWithFourDigits();
    }

    public static void areFriendsTestWithFourDigits()
    {
        java.util.Random r = new java.util.Random();

        while (true) {
            int x = r.nextInt(1000, 10000);
            int y = r.nextInt(1000, 10000);
            if(areFriends(x, y)) {
                System.out.printf("%d ile %d sayısı arkadaştır%n", x, y);
                break;
            }
        }
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayi giriniz:"); // 5020, 2924
        int x = Integer.parseInt(kb.nextLine());

        System.out.print("Bir baska sayi giriniz:"); // 5564, 2620
        int y = Integer.parseInt(kb.nextLine());

        System.out.printf("%d ve %d sayıları arkadaş sayı%s%n", x, y, areFriends(x, y) ? "dır." : " değildir");
    }

    public static boolean areFriends(int x, int y)
    {
        return Homework_5_2.sumFactors(x) == y && Homework_5_2.sumFactors(y) == x;
    }
}
