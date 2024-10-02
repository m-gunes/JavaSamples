package org.csystem.homework.sixth;

import java.util.Random;

public class Homework_6 {
    public static void main(String[] args)
    {
        run();
    }

    public static int rollTheDice(Random r)
    {
        return r.nextInt(1, 7) + r.nextInt(1, 7);
    }

    public static int craps(Random r)
    {
        int firstTotalDice = rollTheDice(r);

        if(firstTotalDice == 7 || firstTotalDice == 11)
            return 1;
        else if (firstTotalDice < 4 || firstTotalDice == 12)
            return 0;
        else {
            while (true) {
                int secondTotalDice = rollTheDice(r);

                if(firstTotalDice == secondTotalDice)
                    return 1;

                if(secondTotalDice == 7)
                    return 0;
            }
        }
    }

    public static void run() {
        Random r = new Random();
        int count = 100_000;
        int n = 0;

        for(int i = 0; i < count; ++i)
            n += craps(r);

        System.out.printf("Oyuncunun kazanma olasılığı: %f", (double)n / count);
    }
}
