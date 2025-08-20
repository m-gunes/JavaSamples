package org.csystem.app;

import org.csystem.math.geometry.Point;
import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {

    }
}

class C extends B {

    public void foo() // error
    {
        Console.writeLine("B.foo");
    }

}

class B extends A {
    public final  void foo()
    {
        Console.writeLine("B.foo");
    }
}

class A {
    public void foo()
    {
        Console.writeLine("A.foo");
    }
}