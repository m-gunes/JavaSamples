package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int [][] generateRandomMatrix(Random random, int m, int n, int origin, int bound)
    {
        int [][] a = new int[m][];

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j)
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
        for(int i = 0; i < a.length - 1; ++i)
            if(a[i].length != a[i+1].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }
}
