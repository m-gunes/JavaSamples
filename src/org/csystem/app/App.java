package org.csystem.app;

import org.csystem.math.geometry.Point;
import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {

        Sample.foo();
        Console.writeLine("--------------------");
        Sample.foo();
        Console.writeLine("--------------------");
        Console.writeLine("Value:%d", Sample.getValue());
        Console.writeLine("Value:%d", Sample.getValue());

    }
}

class Sample {
    private static final int VALUE;

//    private static final int VALUE = randomIntValue();
//    private static int randomIntValue()
//    {
//        Console.writeLine("static method");
//        Random random = new Random();
//        return random.nextInt(100);
//    }
    static {
        Console.writeLine("Static initializer 1");
        Random random = new Random();
        VALUE = random.nextInt(100);
    }

    static {
        Console.writeLine("Static initializer 2");
    }

    public Sample(int a)
    {

    }

    static {
        Console.writeLine("Static initializer 3");
    }

    public static int getValue()
    {
        return VALUE;
    }

    public static void foo()
    {
        Console.writeLine("foo");
    }
}