package org.csystem.app.lottery.numeric;

import java.util.Arrays;
import java.util.Random;

/*----------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Sayısal loto kupon üreten programı yazınız.
Açıklama: Bir sayısal loto kuponu birbirinden farklı 6 tane küçükten büyüğe sıralanmış [1, 49] aralığındaki sayılardan oluşur

Anahtar Notlar: Arrays sınıfının sort metodu parametresi ile aldığı diziyi (ascending) artan şekilde sıralar
----------------------------------------------------------------------------------------------------------------*/
public class NumericLottery {
    private final Random random;
    public NumericLottery(Random r)
    {
        random = r;
    }

    public boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];
        for(int i = 0; i < 6; ++i) {
            int val;
            do
                val = random.nextInt(1, 50);
            while (flags[val]);

            flags[val] = true;
        }

        return flags;
    }

    public int [] getNumbers(boolean [] flags)
    {
        int [] a = new int[6];
        int idx = 0;

        for(int i = 1; i < flags.length; ++i)
            if(flags[i])
                a[idx++] = i;

        return a;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [] getNumbers1()
    {
        int [] a = new int[6];
        boolean [] flags = new boolean[50];

        for(int i = 0; i < a.length; ++i) {
            int val;
            do
               val = random.nextInt(1, 50);
            while (flags[val]);

            flags[val] = true;
            a[i] = val;
        }

        Arrays.sort(a); // buna gerek yok
        return a;
    }

    public int [] getNumbers2()
    {
        int [] a = new int[6];
        boolean [] flags = new boolean[50];

        for(int i = 1; i < a.length; ++i) {
            boolean repeat;
            do {
                repeat = false;
                a[i] = random.nextInt(1, 50);

                if(!flags[a[i]])
                    flags[a[i]] = true;
                else
                    repeat = true;

            } while (repeat);
        }

        Arrays.sort(a);
        return a;
    }


    // Not: Aşağıdaki yaklaşım çok iyi değildir
    public int [] getNumbers3()
    {
        int [] a = new int[6];
        for(int i = 0; i < 6; ++i){
            boolean repeat;
            do {
                repeat = false;
                a[i] = random.nextInt(1, 50);
                for(int k = 0; k < i; ++k) {
                    if(a[k] == a[i]){
                       repeat = true;
                       break;
                    }
                }
            } while (repeat);
        }

        Arrays.sort(a);
        return a;
    }
}

/*
 Kisilerin zorlandigi sey algoritmalar degil.

 Asil olan implementasyondur.

 iki nokta onemli programlarmada
    1. algoritma
    2. implementasyon

Onemli olan algoritmayi implemente etmek.

Ornegin Eratosten algoritmasi 2 bin yillik bir algoritma. (Sieve of Eratosthenes (Eratosten kalburu))
Zaten bilinen bisi. Peki bunu implemente edebiliyor muyuz?

*/