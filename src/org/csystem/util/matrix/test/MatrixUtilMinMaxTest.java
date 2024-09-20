package org.csystem.util.matrix.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.*;

public class MatrixUtilMinMaxTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter the number of rows:");
            int m = Integer.parseInt(kb.nextLine());

            System.out.print("Enter the number of columns:");
            int n = Integer.parseInt(kb.nextLine());

            if(m <= 0 || n <= 0)
                break;

            int [][] a = generateRandomMatrix(random, m, n, 0, 100);

            print(a, 2);
            System.out.printf("Largest number in the matrix = %d%n", max(a));
            System.out.printf("Smallest number in the matrix = %d%n", min(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
