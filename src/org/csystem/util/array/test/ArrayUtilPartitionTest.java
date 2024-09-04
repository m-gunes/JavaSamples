package org.csystem.util.array.test;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilPartitionTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Input a number for array length: ");
            int count = Integer.parseInt(kb.nextLine());
            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);
            print(a, 2);

            System.out.print("Input threshold: ");
            int threshold = Integer.parseInt(kb.nextLine());

            int partitionPoint = partition(a, threshold);
            print(a);
            System.out.printf("partitionPoint is %d%n", partitionPoint);
        }
    }
}
