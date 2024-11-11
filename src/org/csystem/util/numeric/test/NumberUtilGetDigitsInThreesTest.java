package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.numeric.NumberUtil.*;

/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının Türkçe okunuşuna geri dönen numToStrTR metodunu
    NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz

    Açıklamalar:

    Sayının okunuşuna ilişkin elde edilecek yazılar şu şekilde olacaktır: Sayı 12345608 ise okunuşu
    on iki milyon üç yüz kırk beş bin altı yüz sekiz
    Sayı -12345608 ise okunuşu eksi on iki milyon üç yüz kırk beş bin altı yüz sekiz

    Okunuştaki kelimeler arasında birer adet SPACE karakteri olduğuna dikkat ediniz
-----------------------------------------------------------------------------------------------------------------------*/

public class NumberUtilGetDigitsInThreesTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Input a number: ");

        int a = kb.nextInt();
        for(int i = 0; i < a; ++i) {
            long val = r.nextLong();
            System.out.printf("%d -> ", val);
            print(getDigitsInThrees(val));
        }
    }
}
