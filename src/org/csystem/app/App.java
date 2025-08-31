package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Util.doWork();
        }
        catch (NaNException ex) {
            Console.writeLine("NaN Exception:%s", ex.getMessage());
        }
        finally {
            System.out.println("Finally block in main");
        }

        System.out.println("main ends..");
    }
}

class Util {
    public static void doWork() throws NaNException // banane NaNException benim isim degil
    {
        try {
            Scanner kb = new Scanner(System.in);
            double a = Console.readDouble("Input a number:", "Invalid value!...");
            double result;
            result = MathUtil.log10(a);
            System.out.printf("log10(%f) = %f%n", a, result);
        }
        catch (NegativeInfinityException ex) {
            Console.writeLine("Negative exception:%s", ex.getMessage());
        }
        finally {
            System.out.println("finally block in doWork");
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a) throws NegativeInfinityException, NaNException // ben firlatiyorum beni cagiran dusunsun
    {
        if (a < 0)
            throw new NegativeInfinityException("Value %f can not be negative".formatted(a));

        if (a == 0)
            throw new NaNException("Value can not be zero");

        return Math.log10(a);
    }
}

class NegativeInfinityException extends Exception {
    public NegativeInfinityException()
    {
        this(null);
    }

    public NegativeInfinityException(String message)
    {
        super(message);
    }
}

class NaNException extends Exception{
    public NaNException()
    {
        this(null);
    }

    public NaNException(String message)
    {
        super(message);
    }
}
