package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

/*----------------------------------------------------------------------------------------------------------------

Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanları toplamına geri dönen
sum metodunu ArrayUtil sınıfı içerisinde yazınız. Metodunuzu rassal olarak üretilmiş diziler ile test ediniz.

----------------------------------------------------------------------------------------------------------------*/
public class ArrayUtilSumTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        while(true) {
            System.out.print("Input a array count:");
            int len = kb.nextInt();
            if(len <= 0)
                break;

            int [] a = generateRandomArray(random, len, 1, 10);
            print(a, 2);
            System.out.printf("Total %d%n", sum(a));
        }
    }
    public static void main(String[] args)
    {
        run();
    }
}
