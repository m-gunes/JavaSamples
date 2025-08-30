package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
       int first = Console.readInt("Input first number:", "Invalide first number");
       int second = Console.readInt("Input second number:", "Invalide second number");
       Console.writeLine(first * second);
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
        catch (NegativeException ex) {
            System.out.println("Negative value is invalid for logarithm");
            throw ex;
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a)
    {
        if (a < 0)
            throw new NegativeException();

        if (a == 0)
            throw new ZeroException();

        return Math.log10(a);
    }
}

class NegativeException extends MathException {

}

class ZeroException extends MathException {

}

class MathException extends RuntimeException {

}