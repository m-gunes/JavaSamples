package org.csystem.app;
import mustafa.Sample; // burada niteliksiz isim arama kurallari devreye girmeyecekti. Artik bu bildirimle bu bildirimle bu derleme biriminde sample gorursen bunu al diyor.
import static org.csystem.util.array.ArrayUtil.generateRandomArray;
import static org.csystem.util.array.ArrayUtil.print;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        while (true){
            System.out.print("Input a number:");
            int count = kb.nextInt();
            if(count <= 0)
                break;

            int [] a = generateRandomArray(random, count, 0, 100);
            print(a, 2);
        }
    }

}


//public class Sample { // ayni derleme biriminde oldugu icin bunu daha onemli olarak yorumluyor.
//    public static void foo(){
//        System.out.println("mustafa.Sample.foo()");
//    }
//}
