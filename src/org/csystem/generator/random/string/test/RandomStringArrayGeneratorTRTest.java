package org.csystem.generator.random.string.test;

import org.csystem.generator.random.string.RandomStringArrayGeneratorTR;

import java.util.Random;

public class RandomStringArrayGeneratorTRTest {
    public static void main(String[] args)
    {
        RandomStringArrayGeneratorTR generator = new RandomStringArrayGeneratorTR(new Random(), 5, 4, 11);
        String [] texts = generator.getTexts();

        System.out.println("Texts:");
        for (String text : texts)
            System.out.println(text);
        System.out.println("-----------------------");

        for (int i = 0; i < texts.length; ++i)
            texts[i] = texts[i].toUpperCase();

        System.out.println("Texts:");
        for (String text : texts)
            System.out.println(text);
        System.out.println("-----------------------");

        System.out.println("Generated Texts:");
        for (String text : generator.getTexts())
            System.out.println(text);
        System.out.println("------------------------");

    }
}
