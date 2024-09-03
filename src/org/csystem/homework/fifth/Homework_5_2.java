package org.csystem.homework.fifth;

/*----------------------------------------------------------------------------------------------------------------------
	Homework-005-2.sorunun çözümü
-----------------------------------------------------------------------------------------------------------------------*/

public class Homework_5_2 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int a = kb.nextInt();
        System.out.printf("%d sayısının tüm çarpanlarının toplamı %d 'dır%n", a, sumFactors(a));
    }

    public static int sumFactors(int a)
    {
        int val = 1;
        int total = 0;

        while(val <= a / 2) { // Bir sayının yarısından sonrası sayıyı bölemez
            if(a % val == 0)
                total += val;
            ++val;
        }
        return total;
    }
}


