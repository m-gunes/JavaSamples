package org.csystem.app;
import mustafa.Sample; // burada niteliksiz isim arama kurallari devreye girmeyecekti. Artik bu bildirimle bu bildirimle bu derleme biriminde sample gorursen bunu al diyor.
import static org.csystem.util.array.ArrayUtil.generateRandomArray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        refArrWithObject();
    }

    public static void refArrWithObject()
    {
        Sample2 [] refList;
        refList = new Sample2[10];

        for(int i = 0; i < 10; ++i)
            refList[i] = new Sample2(i);

        System.out.println("Printing...");

        for(int i = 0; i < 10; ++i)
            System.out.printf("%d", refList[i].x);

    }
    public static void refArr()
    {
        Sample2 [] refList;
        refList = new Sample2[10];

        for(int i = 0; i < 10; ++i)
           refList[i].x = i;

        System.out.println("Printing...");

        for(int i = 0; i < 10; ++i)
            System.out.printf("%d", refList[i].x);

    }
}

class Sample2 {
    public int x;
    public Sample2(int a)
    {
        x = a;
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
