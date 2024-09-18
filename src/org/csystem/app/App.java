package org.csystem.app;
//import mustafa.Sample; // burada niteliksiz isim arama kurallari devreye girmeyecekti. Artik bu bildirimle bu bildirimle bu derleme biriminde sample gorursen bunu al diyor.

import org.csystem.util.console.CommandLineArgsUtil;

import java.util.Random;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;

class App {
    public static void main(String[] args) {

        checkLengthEquals(3, args.length, "usage: java org.csystem.app.App <count> <origin> <bound>" );

        Random random = new Random();
        int count = Integer.parseInt(args[0]);
        int origin = Integer.parseInt(args[1]);
        int bound = Integer.parseInt(args[2]);

        for(int i = 0; i < count; ++i)
            System.out.printf("%d ", random.nextInt(origin, bound));

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
