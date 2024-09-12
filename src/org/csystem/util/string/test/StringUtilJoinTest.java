package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;
/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Aşağıda prototipi verilen metodu StringUtil sınıfı içerisinde açıklamalara göre yazınız ve aşağıdaki kod ile
        test ediniz: public static String join(String [] s, String delimiter)

        Açıklamalar:
            Metot birinci parametresi ile aldığı String dizisi ile tutulan yazıları ikinci parametresi ile aldığı
            separator ile birleştirilmiş bir yazıya geri dönecektir.
            Metot parametre geçerlilik kontrolü yapmayacaktır
-----------------------------------------------------------------------------------------------------------------------*/

public class StringUtilJoinTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Input a number: ");
        String [] s = StringUtil.generateRandomTextsTR(r, kb.nextInt(), 5, 16);

        System.out.printf("%s ", StringUtil.join(s, "--"));
    }
}
