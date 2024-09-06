package org.csystem.homework.tenth;


/*----------------------------------------------------------------------------------------------------------------------
	Homework-010-3.sorunun çözümü
-----------------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Homework_10_3 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        // 1. ve 2. sayiyi diziye donustur (use getDigits() in numeric)
        // bir dizideki elemanlardan digerinde var mi diye bakicaksin.
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int a = kb.nextInt();

        System.out.print("Bir sayi giriniz: ");
        int b = kb.nextInt();

        System.out.printf("%d sayisindan %d sayisi elde %s", a, b, NumberUtil.isPossible(a, b) ? "edilebilir" : "edilemez");
    }
}

class NumberUtil {
    public static boolean isPossible(int a, int b)
    {
        int [] aList = getDigits(a);
        int [] bList = getDigits(b);
        boolean possible;

        for (int i = 0; i < bList.length; ++i) {
            possible = false;
            for (int k = 0; k < aList.length; ++k)
                if(bList[i] == aList[k]) {
                    possible = true;
                    break;
                }

            if(!possible)
                return false;
        }
        return true;
    }

    public static int countDigits(long a)
    {
        return a != 0 ? (int) Math.log10(Math.abs(a)) + 1 : 1;
    }

    public static int [] getDigits(long a)
    {
        int [] digits = new int[countDigits(a)];
        a = Math.abs(a);

        for (int i = digits.length - 1; a != 0; digits[i--] = (int) (a % 10), a /= 10)
            ;

        return digits;
    }
}
