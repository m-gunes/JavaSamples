package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("input a number:");
            double a = kb.nextInt();
            double result;
            result = MathUtil.log10(a);
            System.out.printf("log10(%f) = %f%n", a, result);
        }
        catch (MathException ignore) {
            System.out.println("Invalid input for logarithm");
        }
//        catch (NegativeException ignore) {
//            System.out.println("Negative value is invalid for logarithm");
//        }
//        catch (ZeroException ignore) {
//            System.out.println("Zero value is invalid for logarithm");
//        }
        catch (InputMismatchException ignore) {
            System.out.println("Invalid number");
        }
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