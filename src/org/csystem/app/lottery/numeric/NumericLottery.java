package org.csystem.app.lottery.numeric;

import java.util.Arrays;
import java.util.Random;

/*----------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Sayısal loto kupon üreten programı yazınız.
Açıklama: Bir sayısal loto kuponu birbirinden farklı 6 tane küçükten büyüğe sıralanmış [1, 49] aralığındaki sayılardan oluşur

Not: Aşağıdaki yaklaşım çok iyi değildir
Anahtar Notlar: Arrays sınıfının sort metodu parametresi ile aldığı diziyi (ascending) artan şekilde sıralar
----------------------------------------------------------------------------------------------------------------*/
public class NumericLottery {
    public Random random;
    public NumericLottery(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        int [] a = new int[6];
        boolean [] numTable = new boolean[50];
        for(int i = 0; i < a.length; ++i) {
            boolean repeat;
            do {
                repeat = false;
                a[i] = random.nextInt(1, 50);

                for(int k = 0; k < i; ++k)
                    if(a[k] == a[i]) {
                        repeat = true;
                        break;
                    }
            } while (repeat);

        }

        Arrays.sort(a);
        return a;
    }

}
