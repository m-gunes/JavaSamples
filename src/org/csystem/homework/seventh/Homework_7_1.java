package org.csystem.homework.seventh;

import java.util.Random;

import static org.csystem.util.numeric.NumberUtil.isPrime;

public class Homework_7_1 {
    public static void main(String[] args)
    {
        run();
    }

    public static boolean checkMinMax(int a, int b, int c)
    {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        return max - min > mid;
    }

    public static boolean playTombola(int a, int b, int c)
    {
        int total = a + b + c;
        return total < 150 || isPrime(total) || checkMinMax(a, b, c);
    }

    public static boolean tombola(Random r)
    {
        int a = 0, b = 0, c = 0;

        do {
            a = r.nextInt(1, 100);
            b = r.nextInt(1, 100);
            c = r.nextInt(1, 100);
        } while (a == b || a == c || b == c);

        return playTombola(a, b, c);
    }

    public static void run()
    {
        Random r = new Random();
        int count = 30_000;
        int n = 0;

        for(int i = 0; i < count; ++i)
            if(tombola(r))
                ++n;

        System.out.printf("Oyuncunun kazanma olasılığı: %f", (double)n / count);
    }
}
