package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.numeric.NumberUtil.numToStrEN;

/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının Türkçe okunuşuna geri dönen numToStrTR metodunu
    NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz

    Açıklamalar:

    Sayının okunuşuna ilişkin elde edilecek yazılar şu şekilde olacaktır: Sayı 12345608 ise okunuşu
    on iki milyon üç yüz kırk beş bin altı yüz sekiz
    Sayı -12345608 ise okunuşu eksi on iki milyon üç yüz kırk beş bin altı yüz sekiz

    Okunuştaki kelimeler arasında birer adet SPACE karakteri olduğuna dikkat ediniz
-----------------------------------------------------------------------------------------------------------------------*/


public class NumberUtilNumToStrENTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int n = kb.nextInt();

        for (int i = 0; i < n; ++i) {
            long val = r.nextLong();

            System.out.printf("%d -> ", val);
            System.out.printf("(%s)%n", numToStrEN(val));
        }
        long a = 0;
        System.out.printf("%d -> ", 0);
        System.out.printf("(%s)%n", numToStrEN(0));

        a = -109;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = 1923;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));
        a = 3923;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = -1;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = 1_000_001;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = 1_001;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = 1_000_000_000_001L;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));

        a = 1000;
        System.out.printf("%d -> ", a);
        System.out.printf("(%s)%n", numToStrEN(a));
    }

    public static void main(String[] args)
    {
        run();
    }
}