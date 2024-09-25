package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;

public class MatrixUtilMultiplyBy {

    public static void run()
    {
        Random random = new Random();

        int [][] a = MatrixUtil.generateRandomMatrix(random, 5, 6, 1, 10);
        MatrixUtil.print(a, 2);

        System.out.println("-------------");

//        MatrixUtil.multiplyBy(a, 2);
       int [][] c = MatrixUtil.transpose(a);
        MatrixUtil.print(c, 2);
    }

    public static void main(String[] args)
    {
        run();
    }

}
