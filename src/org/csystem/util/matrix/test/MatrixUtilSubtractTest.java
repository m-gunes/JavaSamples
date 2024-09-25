package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;

public class MatrixUtilSubtractTest {
    public static void run()
    {
        Random random = new Random();

        int [][] a = MatrixUtil.generateRandomMatrix(random, 5, 5, 1, 10);
        MatrixUtil.print(a, 2);

        System.out.println("-------------");

        int [][] b = MatrixUtil.generateRandomMatrix(random, 5, 5, 1, 10);
        MatrixUtil.print(b, 2);

        System.out.println("-------------");

        int [][] c = MatrixUtil.subtract(a, b);
        MatrixUtil.print(c, 2);
    }

    public static void main(String[] args)
    {
        run();
    }
}
