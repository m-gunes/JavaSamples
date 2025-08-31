package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Util.doWork();
        }
        catch (ZeroException ex) {
            System.out.printf("Zero -> %s%n", ex.getMessage());
        }
        catch (NegativeException ex) {
            System.out.printf("Negative -> %s%n", ex.getMessage());
        }
        catch (InputMismatchException ignore) {
            System.out.println("Invalid numeric value");
        }
        finally {
            System.out.println("Finally block in main");
        }


        System.out.println("main ends..");
    }
}

class Util {
    public static void doWork() {

        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("input a number:");
            double a = kb.nextInt();
            double result;
            result = MathUtil.log10(a);
            System.out.printf("log10(%f) = %f%n", a, result);
        }
        finally {
            System.out.println("finally block in doWork");
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a)
    {
        if (a < 0)
            throw new NegativeException("Value %f can not be negative".formatted(a));

        if (a == 0)
            throw new ZeroException("Value can not be zero");

        return Math.log10(a);
    }
}

class NegativeException extends RuntimeException {
    public NegativeException()
    {
    }

    public NegativeException(String message)
    {
        super(message);
    }
}

class ZeroException extends RuntimeException {
    public ZeroException()
    {
    }

    public ZeroException(String message)
    {
        super(message);
    }
}
