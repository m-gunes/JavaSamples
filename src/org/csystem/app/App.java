package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
    }
}

class Sample {
    public static void doWork() throws IOException {
        //..
    }
}

class E extends A {
    public void foo() throws MathException {
        try {
            Sample.doWork();
        } catch (IOException ex) {
            throw new WrapperException("io problem occurred", ex);
        }
    }
}

class D extends A {
    public void foo() throws MathException {
    }
}
class C extends A {
    public void foo() throws NegativeInfinityException, NaNException {
    }
}

class B extends A {
    public void foo() {
        //..
    }
}

abstract class A {
    public abstract void foo() throws MathException;
}

class WrapperException extends RuntimeException {
    public WrapperException()
    {

    }

    public WrapperException(String message)
    {
        this(message, null);
    }

    public WrapperException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public String getMessage()
    {
        Throwable cause = getCause();
        return "Message: %s%s".formatted(super.getMessage(), cause != null ? "Cause Message: %s".formatted(cause.getMessage()): "");
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