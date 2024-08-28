package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.array.ArrayUtil.*;

import java.util.Random;

public class ArrayUtilBubbleSortTest {
    public static void run()
    {
        int [] a = ArrayUtil.generateRandomArray(new Random(), 10, 1, 100);
        ArrayUtil.print(a);
        System.out.println("Sorting.....");
        ArrayUtil.bubbleSort(a, true);
        ArrayUtil.print(a);
    }
    public static void main(String [] args)
    {
        run();
    }
}
