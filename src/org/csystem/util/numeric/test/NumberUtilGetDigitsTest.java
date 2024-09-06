package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.numeric.NumberUtil.*;

/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Parametresi ile aldığı long türden bir sayının basamaklarından oluşan diziye geri dönen getDigits isimli
        metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
        Açıklama: Metot negatif bir argüman için basamak değerlerini pozitif olarak verecektir
-----------------------------------------------------------------------------------------------------------------------*/

public class NumberUtilGetDigitsTest {
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
            print(getDigits(val));
        }
    }
}
