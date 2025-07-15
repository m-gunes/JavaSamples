package org.csystem.util.array;

import java.util.Arrays;
import java.util.Random;

public final class ArrayUtil {
    private ArrayUtil()
    {
    }

    /**
     *
     Ascending order -> kucukten buyuge, artan, dogal siralama (natural sort order)
     */
    public static void bubbleSortAscending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if(a[k] > a[k + 1])
                    swap(a, k, k+1);
    }

    public static void bubbleSortDescending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if(a[k] < a[k + 1])
                    swap(a, k, k+1);
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    /**
     *
     Bubble sort:
     iki'serli karsilastirilip buyuk olan en sona cekiliyor (ascending order)
     */
    public static void bubbleSort(int [] a, boolean descending)
    {
        if(descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void drawHistogram(int [] data, int n, char ch)
    {
        int maxValue = ArrayUtil.max(data);

        for (int grade : data) {
            int count = (int)Math.floor(grade * n / (double)maxValue);

            while (count-- > 0)
                System.out.print(ch);

            System.out.println();
        }
    }

    public static void selectionSortAscending(int [] a)
    {
        // Seçerek sıralama algoritmasında en küçük eleman bulunur, ilk eleman ile değiştirilir. Dizi bir daraltılır, aynı işlem daraltılmış dizi için yapılır.
        int min, minIndex; // swap islemini kolaylastirmak icin tanimlandi
        for(int i = 0; i < a.length - 1; ++i) {
           min = a[i];
           minIndex = i;

           for(int k = i + 1; k < a.length; ++k)
               if(a[k] < min) {
                   min = a[k];
                   minIndex = k;
               }
           a[minIndex] = a[i];
           a[i] = min;
        }
    }

    public static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;
        for(int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for(int k = i + 1; k < a.length; ++k)
                if(max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    /**
     *
     Selection sort:
     dizinin en kucuk/buyuk elemani bulunup en basa cekiliyor
     */
    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }
    public static void selectionSort(int [] a, boolean descending)
    {
        if(descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }


    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;
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

    public static int [] histogramData(int [] a, int n) // don't forget
    {
        int [] data = new int[n + 1];

        for(int val : a)
            ++data[val];

        // for (int i = 0; i < a.length; ++i)
        //     ++data[a[i]]; // a[i] index icerisindeki sayi data[] icerisindeki index'e karsilik geliyor ve her seferinde 1 artiriyoruz.

        return data;
    }

    public static int partition(int [] a, int threshold) // don't forget
    {
        int patitionPoint = 0; //  ilk koşula uymayan elemanın bulunduğu indeks değerine denir

        while(patitionPoint != a.length && a[patitionPoint] < threshold)
            ++patitionPoint;

        if(patitionPoint == a.length)
            return patitionPoint;

        for(int i = patitionPoint + 1; i < a.length; ++i)
            if(a[i] < threshold)
                swap(a, i, patitionPoint++);

        return patitionPoint;
    }

    public static int partitionByEven(int [] a)
    {
        int patitionPoint = 0; //  ilk koşula uymayan elemanın bulunduğu indeks değerine denir

        while(patitionPoint != a.length && a[patitionPoint] % 2 == 0)
            ++patitionPoint;

        if(patitionPoint == a.length)
            return patitionPoint;

        for(int i = patitionPoint + 1; i < a.length; ++i)
            if(a[i] % 2 == 0)
                swap(a, i, patitionPoint++);

        return patitionPoint;
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

        for(int val : a)
            System.out.printf(fmt, val, sep);

        System.out.print(end);
    }

    public static void print(double [] a)
    {
        print(a, '\n', '\n');
    }

    public static void print(double [] a, char sep, char end)
    {
        for(double val : a)
            System.out.printf("%f%c", val, sep);

        System.out.print(end);
    }

    public static void print(int [][] a)
    {
        print(a, 1);
    }

    public static void print(int [][] a, int n)
    {
        for (int [] array : a)
            print(array, n, ' ', '\n');
    }

    public static int sum(int [] list) {
        int total = 0;
        for(int val : list)
            total += val;

        return total;
    }

    public static int max(int [] a) {
        int max = a[0];

        for(int i = 1; i < a.length; ++i)
            max = Math.max(max, a[i]);

        return max;
    }

    public static int max(int [][] a)
    {
        int result = Integer.MIN_VALUE; // Don't forget

        for(int [] array : a )
            result = Math.max(result, max(array));

        return result;
    }

    public static int min(int [] a) {
        int min = a[0];

        for(int i = 1; i < a.length; ++i)
            min = Math.min(min, a[i]);

        return min;
    }

    public static int min(int [][] a)
    {
        int result = Integer.MAX_VALUE; // Don't forget

        for(int [] array : a)
            result = Math.min(result, min(array));

        return result;
    }


    //...
}