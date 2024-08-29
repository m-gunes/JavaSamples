package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilBubbleSortTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        while (true){
            System.out.print("Input a number:");
            int count = Integer.parseInt(kb.nextLine());

            if(count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);
            print(a, 2);
            boolean descending = r.nextBoolean();

            System.out.printf("Array is sorted %s:%n", descending ? "descending" : "ascending");
            bubbleSort(a, descending);
            print(a, 2);
        }
    }
    public static void main(String [] args)
    {
        run();
    }
}
