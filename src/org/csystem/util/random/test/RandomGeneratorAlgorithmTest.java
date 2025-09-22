package org.csystem.util.random.test;

import org.csystem.util.console.Console;
import org.csystem.util.random.RandomGeneratorAlgorithm;

import java.util.random.RandomGenerator;

public class RandomGeneratorAlgorithmTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
       for (RandomGeneratorAlgorithm rga: RandomGeneratorAlgorithm.values()) {
           Console.writeLine("Algorithm name: %s", rga.getName());
           RandomGenerator rg = rga.create();
           Console.writeLine("%02d ", rg.nextInt(1, 99));
       }
    }
}
