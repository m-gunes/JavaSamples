package org.csystem.util.matrix.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.*;

public class MatrixUtilGenerateRandomMatrix {
    public static void main(String [] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
        int m = kb.nextInt();
        int n = kb.nextInt();

        int [][] a = generateRandomMatrix(random, m, n, 23, 89);
        printMatrix(a);

        System.out.printf("Dizi dizisi bir %s%n", isMatrix(a) ? "Matris'dir." : "Matris degildir.");
        System.out.printf("Dizi dizisi bir %s%n", isSquareMatrix(a) ? "Kare Matris'dir." : "Kare Matris degildir.");

        int [][] b = generateRandomSquareMatrix(random, m, 23, 89);
        printMatrix(b);

        System.out.printf("Dizi dizisi bir %s%n", isSquareMatrix(b) ? "Kare Matris'dir." : "Kare Matris degildir.");
    }

    public static void printMatrix(int [][] a)
    {
        for(int [] array : a) {
            for(int val : array)
                System.out.printf("%d ", val);
            System.out.println();
        }
    }
}
