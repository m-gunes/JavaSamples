package org.csystem.generator.random.string.test;

import org.csystem.generator.random.string.RandomStringArrayGeneratorTR;

import java.util.Random;

public class RandomStringArrayGeneratorTRTest {

    public static void main(String[] args)
    {
        RandomStringArrayGeneratorTR generator = new RandomStringArrayGeneratorTR(new Random(), 5, 4, 11);
        int size = generator.size();

        for (int i = 0; i < size; ++i)
            System.out.println(generator.get(i));
    }
}
