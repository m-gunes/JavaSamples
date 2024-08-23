package org.csystem.app.lottery.numeric;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class NumericLotteryApp {
    public static void run()
    {
        Random random = new Random();
        NumericLottery lottery = new NumericLottery(random);
        Scanner kb = new Scanner(System.in);
        System.out.print("How many coupon would you like to play?");
        int count = kb.nextInt();

        while (count > 0) {
            int [] a = lottery.getNumbers();
            print(a, 2);
            --count;
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
