package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;

public class MatrixUtilMultiplyTest {
    public static void run()
    {
        Random r = new Random();
         int [][] a = MatrixUtil.generateRandomMatrix(r, 2, 3, 1, 10);
         int [][] b = MatrixUtil.generateRandomMatrix(r, 3, 2, 1, 10);
        // int [][] a = MatrixUtil.generateRandomMatrix(r, 4, 2, 1, 10);
        // int [][] b = MatrixUtil.generateRandomMatrix(r, 2, 3, 1, 10);

        MatrixUtil.print(a, 2);
        System.out.println("------------------");

        MatrixUtil.print(b, 2);
        System.out.println("------------------");

        int [][] c = MatrixUtil.multiply(a, b);
        MatrixUtil.print(c, 2);


    }

    public static void main(String[] args)
    {
       run();
    }
}
