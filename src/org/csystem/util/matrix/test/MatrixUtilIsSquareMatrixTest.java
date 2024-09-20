package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

public class MatrixUtilIsSquareMatrixTest {
    public static void run()
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};
        int [][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};

        ArrayUtil.print(a);
        System.out.println("--------------------------------");
        ArrayUtil.print(b);
        System.out.println("--------------------------------");
        ArrayUtil.print(c);

        System.out.println(MatrixUtil.isSquareMatrix(a) ? "Kare Matris" : "Kare Matris degil");
        System.out.println(MatrixUtil.isSquareMatrix(b) ? "Kare Matris" : "Kare Matris degil");
        System.out.println(MatrixUtil.isSquareMatrix(c) ? "Kare Matris" : "Kare Matris degil");

    }

    public static void main(String[] args)
    {
        run();
    }
}
