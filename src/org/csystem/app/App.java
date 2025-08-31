package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Util.doWork();
        }
        catch (Exception ex) {
            Console.writeLine("Math Exception:%s", ex.getMessage());
        }
        finally {
            System.out.println("Finally block in main");
        }

        System.out.println("main ends..");
    }
}

class Util {
    public static void doWork()
    {
        try {
            Scanner kb = new Scanner(System.in);
            double a = Console.readDouble("Input a number:", "Invalid value!...");
            double result;
            result = MathUtil.log10(a);
            System.out.printf("log10(%f) = %f%n", a, result);
        }
        catch (MathException ex) {
            Console.writeLine("Math Exception: %s", ex.getMessage());
        }
        finally {
            System.out.println("finally block in doWork");
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a) throws MathException
    {
        if (a < 0)
            throw new NegativeInfinityException("Value %f can not be negative".formatted(a));

        if (a == 0)
            throw new NaNException("Value can not be zero");

        return Math.log10(a);
    }
}

class NegativeInfinityException extends MathException {
    public NegativeInfinityException()
    {
        this(null);
    }

    public NegativeInfinityException(String message)
    {
        super(message);
    }
}

class NaNException extends MathException {
    public NaNException()
    {
        this(null);
    }

    public NaNException(String message)
    {
        super(message);
    }
}

class  MathException extends Exception {

    public MathException()
    {
        this(null);
    }

    public MathException(String message)
    {
       super(message);
    }
}