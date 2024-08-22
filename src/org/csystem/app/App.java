package org.csystem.app;
import mustafa.Sample; // burada niteliksiz isim arama kurallari devreye girmeyecekti. Artik bu bildirimle bu bildirimle bu derleme biriminde sample gorursen bunu al diyor.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        int [] a = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
//        a = new int[] {1,2,3,4,5,6};
//        for(int i = 0; i < a.length; ++i)
//            System.out.printf("%d ", a[i]);

    }

    public static int sum(int [] list) {
        int total = 0;
        for(int i = 0; i < list.length; ++i)
            total += list[i];
        return total;
    }
}

class SumOfArrayTest {
    public static void run() {
        Random r = new Random();
        r.nextInt(100);


    }
}

//public class Sample { // ayni derleme biriminde oldugu icin bunu daha onemli olarak yorumluyor.
//    public static void foo(){
//        System.out.println("mustafa.Sample.foo()");
//    }
//}
