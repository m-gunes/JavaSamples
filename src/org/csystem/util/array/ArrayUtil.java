/**
 * Utility class for array operations
 * Last Update: 22nd August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public static void main(String[] args) {

    }
    public static int [] generateRandomArray(Random random, int count, int origin, int bound)
    {
        int [] a = new int[count];

        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(origin, bound);

        return a;
    }

    public static double [] generateRandomArray(Random random, int count, double origin, double bound)
    {
        double [] a = new double[count];

        for (int i = 0; i < count; ++i)
            a[i] = random.nextDouble(origin, bound);

        return a;
    }

    public static boolean [] generateRandomArray(Random random, int count)
    {
       boolean [] a = new boolean[count];
       for(int i = 0; i < count; ++i)
           a[i] = random.nextBoolean();

       return a;


    }

    public static void print(int [] a)
    {
        print(a, ' ', '\n');
    }

    public static void print(boolean [] a)
    {
        for(int i = 0; i < a.length; ++i) {
            System.out.printf("%d: %b%c", i, a[i], ' ');
        }
        System.out.println();
    }

    public static void print(int [] a, char sep, char end)
    {
        print(a, 1, sep, end);
    }

    public static void print(int [] a, int n)
    {
        print(a, n, ' ', '\n');
    }

    public static void print(int [] a, int n, char sep, char end)
    {
        String fmt = String.format("%%0%dd%c", n, sep);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i], sep);

        System.out.print(end);
    }

    public static void print(double [] a)
    {
        print(a, '\n', '\n');
    }

    public static void print(double [] a, char sep, char end)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f%c", a[i], sep);

        System.out.print(end);
    }

    public static int sum(int [] list) {
        int total = 0;
        for(int i = 0; i < list.length; ++i)
            total += list[i];
        return total;
    }

    public static int max(int [] a) {
        int max = a[0];
        for(int i = 1; i < a.length; ++i)
            max = Math.max(max, a[i]);
//            if(max < a[i])
//                max = a[i];
        return max;
    }
    public static int min(int [] a) {
        int min = a[0];
        for(int i = 1; i < a.length; ++i)
            if(a[i] < min)
                min = a[i];
        return min;
    }
    //...
}