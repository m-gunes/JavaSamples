package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Aşağıda prototipi verilen metodu açıklamalara göre yazınız ve test ediniz:
        `public static int [] histogramData(int [] a, int n);`

        Açıklamalar:
        Metot ArrayUtil sınıfı içerisinde yazılacaktır.
        Metodun birinci parametresi, içerisinde [0, n] aralığında değerlerden oluşan bir dizi olacaktır.
        Parametre ile alınan dizinin değerleri için geçerlilik kontrolü yapılmayacaktır.
        Metot, parametresi ile aldığı dizinin içerisinde [0, n] aralığındaki sayıların sıklık sayılarından
        yani hangi sayıdan kaç tane olduğu bilgisine ilişkin diziye geri dönecektir.
        Geri dönüş değeri olan dizinin indeks numarası [0, n] aralığındaki ilgili sayıya karşılık gelecektir.
        Yani örneğin 25 numaralı indeksteki eleman, 25 sayısının kaç tane olduğu bilgisini tutacaktır.
-----------------------------------------------------------------------------------------------------------------------*/

public class ArrayUtilHistogramDataTest {
    public static void main(String[] args)
    {
       run();
    }

    public static void run()
    {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Input a number: ");
            int count = Integer.parseInt(kb.nextLine());
            if(count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 11);

            System.out.print("Array: ");
            print(a);

            int [] hist = histogramData(a, 10);
            System.out.print("Histogram Array: ");
            print(hist);
        }
    }
}
