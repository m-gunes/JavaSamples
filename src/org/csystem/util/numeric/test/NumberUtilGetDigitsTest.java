package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.numeric.NumberUtil.*;

public class NumberUtilGetDigitsTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Input a number: ");

        int a = kb.nextInt();
        for(int i = 0; i < a; ++i) {
            long val = r.nextLong();
            System.out.printf("%d -> ", val);
            print(getDigits(val));
        }
    }
}
