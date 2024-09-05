package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;
import static org.csystem.util.array.ArrayUtil.print;

public class ArrayUtilPartitionByEvenTest {
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

            int partitionPoint = partitionByEven(a);
            System.out.printf("partitionPoint is %d%n", partitionPoint);
            print(a, 2);
        }
    }
}
