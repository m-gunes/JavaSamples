package org.csystem.math;

import org.csystem.util.console.Console;

public class FractionTest {
    public static void run()
    {
        Fraction f = new Fraction(4, -18);
        int a = f.getNumerator();
        int b = f.getDenominator();
        Console.writeLine("a:%d / b:%d", a, b);
    }
    public static void main(String[] args)
    {
        run();
    }
}
