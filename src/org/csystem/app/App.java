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
        catch (InputMismatchException ignore) {
            System.out.println("Invalid numeric value");
        }
        catch (RuntimeException ex)
        {
            ex.printStackTrace();
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
        super(message, MathExceptionStatus.NEGATIVE_INFINITY);
    }
}

class NaNException extends MathException{
    public NaNException()
    {
        this(null);
    }

    public NaNException(String message)
    {
        super(message, MathExceptionStatus.NAN);
    }
}

class MathException extends RuntimeException {
    private final MathExceptionStatus m_mathExceptionStatus;

    public MathException(String message, MathExceptionStatus mathExceptionStatus)
    {
        super(message);
        m_mathExceptionStatus = mathExceptionStatus;
    }

    public String getMessage()
    {
        return "Message: %s, Status: %s".formatted(super.getMessage(), m_mathExceptionStatus);
    }

    public MathExceptionStatus getMathExceptionStatus()
    {
        return m_mathExceptionStatus;
    }
}


enum MathExceptionStatus {
    NAN, NEGATIVE, ZERO, INFINITY, POSITIVE_INFINITY, NEGATIVE_INFINITY
}