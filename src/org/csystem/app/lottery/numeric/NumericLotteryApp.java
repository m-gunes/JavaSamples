package org.csystem.app.lottery.numeric;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery(new Random());

        while (true) {
            System.out.print("How many coupon would you like to play?");
            int n = kb.nextInt();

            if(n <= 0) {
                System.out.println("Please, input positive number!");
                continue;
            }

            while (n-- > 0)
                ArrayUtil.print(numericLottery.getNumbers(), 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
