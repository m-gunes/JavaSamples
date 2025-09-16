package org.csystem.math.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;

import java.util.Scanner;

public class FractionTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        Console.write("Input a numerator and denominator:");
        int numerator = kb.nextInt();
        Console.write("Input a denominator:");
        int denominator = kb.nextInt();

        Console.writeLine("num: %d | den: %d", numerator, denominator);

        Fraction f = new Fraction(numerator, denominator);
        int a = f.getNumerator();
        int b = f.getDenominator();
        Console.writeLine("A: %d | B: %d", a, b);
    }

    public static void main(String[] args) {
        run();
    }
}
