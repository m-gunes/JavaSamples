package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;

public class MatrixUtilCountIslands {
    public static void run()
    {
        Random random = new Random();

        int [][] a = MatrixUtil.generateRandomMatrix(random, 10, 10, 0, 2);
        MatrixUtil.print(a, 2);

        System.out.println("-------------");

        int c = MatrixUtil.countIslands(a);
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        run();
    }
}
