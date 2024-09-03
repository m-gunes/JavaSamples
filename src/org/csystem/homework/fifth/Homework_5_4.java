package org.csystem.homework.fifth;

/*----------------------------------------------------------------------------------------------------------------------
	Homework-005-4.sorunun çözümü
-----------------------------------------------------------------------------------------------------------------------*/

public class Homework_5_4 {
    public static void main(String[] args)
    {
        isPerfectWithFourDigitsTest();
    }

    public static void isPerfectTest()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a = kb.nextInt();
        System.out.printf("%d sayısı mükemmel %s.", a, isPerfect(a) ? "sayıdır" : "sayı değildir");
    }

    public static void isPerfectWithFourDigitsTest()
    {
        int val = 1000;
        while (true) {
            if(isPerfect(val)) {
                System.out.printf("%d sayısı mükemmel sayıdır.", val); // 8128
                break;
            }
            ++val;
        }
    }

    public static boolean isPerfect(int a)
    {
        return a == Homework_5_2.sumFactors(a);
    }
}
