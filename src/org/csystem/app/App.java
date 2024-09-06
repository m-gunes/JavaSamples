package org.csystem.app;
import mustafa.Sample; // burada niteliksiz isim arama kurallari devreye girmeyecekti. Artik bu bildirimle bu bildirimle bu derleme biriminde sample gorursen bunu al diyor.
import static org.csystem.util.array.ArrayUtil.generateRandomArray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        String s = Util.changeCase("MustAfa");
        System.out.print(s);
    }
}

class Util {
    public static String changeCase(String s)
    {
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; ++i)
            c[i] = Character.isLowerCase(c[i]) ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);

        return String.valueOf(c);
    }
}
/*

 Ascending order -> kucukten buyuge, artan, dogal siralama (natural sort order)

Bubble sort:
iki'serli karsilastirilip buyuk olan en sona cekiliyor (ascending order)

Selection sort:
dizinin en kucuk/buyuk elemani bulunup en basa cekiliyor


* */


//public class Sample { // ayni derleme biriminde oldugu icin bunu daha onemli olarak yorumluyor.
//    public static void foo(){
//        System.out.println("mustafa.Sample.foo()");
//    }
//}
