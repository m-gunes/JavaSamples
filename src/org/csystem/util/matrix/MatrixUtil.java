package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int[][] add(int[][] a, int[][] b)
    {
        int [][] c = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < a[i].length; ++j)
                c[i][j] = a[i][j] + b[i][j];

        return c;
    }

    public static int[][] transpose(int[][] a)
    {

        int [][] b = new int[a[0].length][a.length];

        for(int i = 0; i < b.length; ++i)
            for(int j = 0; j < b[i].length; ++j)
                b[i][j] = a[j][i];

        return b;
    }

    public static int countIslands(int [][] a)
    {
        int total = 0;

        for(int i = 1; i < a.length - 1; ++i)
            for(int j = 1; j < a[i].length - 1; ++j)
                if(a[i][j] == 0 && a[i][j-1] == 0 && a[i][j+1] == 0 && a[i-1][j] == 0 && a[i+1][j] == 0){
                    System.out.printf("row: %d column: %d%n", i, j); // test icin
                    ++total;
                }

        return total;
    }
    public static int [][] multiply(int [][] a, int [][] b)
    {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int [][] c = new int[m][p]; // c[m x p]

        for (int i = 0; i < m; ++i)
           for (int j = 0; j < p; ++j)
               for (int k = 0; k < n; ++k)
                   c[i][j] += a[i][k] * b[k][j];

        return c;
    }


    public static int[][] subtract(int [][] a, int [][] b)
    {
        int [][] c = new int[a.length][a[0].length];

        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < a[i].length; ++j)
                c[i][j] = a[i][j] - b[i][j];

        return c;
    }

    public static void multiplyBy(int [][] a, int value)
    {
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < a[i].length; ++j)
                a[i][j] *= value;
    }

    public static int [][] generateRandomMatrix(Random random, int m, int n, int origin, int bound)
    {
        int [][] a = new int[m][];

        for(int i = 0; i < m; ++i) {
            a[i] = ArrayUtil.generateRandomArray(random, n, origin, bound);
        }

        return a;
    }

    public static int [][] generateRandomSquareMatrix(Random random, int n, int origin, int bound)
    {
        return generateRandomMatrix(random, n, n, origin, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for(int i = 1; i < a.length; ++i)
            if(a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

    public static int max(int [][] a)
    {
       return ArrayUtil.max(a);
    }

    public static int min(int [][] a)
    {
        return ArrayUtil.min(a);
    }

    public static void print(int [][] a, int n)
    {
        ArrayUtil.print(a, n);
    }
    public static long sum(int [][] a)
    {
        long total = 0;
        for(int [] array : a)
            total += ArrayUtil.sum(array);

        return total;
    }

    public static long sumDiagonal(int [][] a)
    {
        long total = 0;
        for(int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }
}
