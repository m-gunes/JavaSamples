package org.csystem.subject;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfArray {
    public static void main(String[] args)
    {
        matrixWithForEach();
    }

    public static void matrixDefaultLengthForMainArr()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
        int m = kb.nextInt();
        int n = kb.nextInt();

        int [][] a = new int[m][]; // ilk []'in içeris boş olamaz. Çünkü ilk [] ana dizinin uzunluğunu belirtir. Diğer []'ler boş olabilir.

        for(int i = 0; i < m; ++i) {
            a[i] = new int[n]; // a[i] => i => int[n]
            for(int j = 0; j < n; ++j)
                a[i][j] = r.nextInt(10);
        }

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j)
                System.out.printf("%02d ", a[i][j]);
            System.out.println();
        }
    }

    public static void matrixDefaultLengthForMainAndSubArr()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
        int m = kb.nextInt();
        int n = kb.nextInt();

        int [][] a = new int[m][n]; // Bir dizi dizisinin ana dizisi dışında kalan []'ler içeirisinde uzunluk yazıldığında ilgili dizilee otomatik olarak o uzunlukta yaratılır.

        for(int i = 0; i < m; ++i) {
//            a[i] = new int[n]; // a[i] => i => int[n] // Buna gerek yok zaten [n] ile olusturuldu.
            for(int j = 0; j < n; ++j)
                a[i][j] = r.nextInt(10);
        }

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j)
                System.out.printf("%02d ", a[i][j]);
            System.out.println();
        }
    }

    public static void matrixWithExternalArr()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
        int m = kb.nextInt();
        int n = kb.nextInt();

        int [][] a = new int[m][]; // ikinci []'in içerisinde n yazılması gereksizdir.

        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                a[i] = ArrayUtil.generateRandomArray(r, n, 0, 100);

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j)
                System.out.printf("%02d ", a[i][j]);
            System.out.println();
        }
    }

    public static void matrixWithForEach()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
        int m = kb.nextInt();
        int n = kb.nextInt();

        int [][] a = new int[m][]; // ikinci []'in içerisinde n yazılması gereksizdir.

        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                a[i] = ArrayUtil.generateRandomArray(r, n, 0, 100);

        for(int [] array : a) {
            for(int val : array)
                System.out.printf("%02d ", val);
            System.out.println();
        }
    }
}
