package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Sample s1 = new Sample(3);
        Console.writeLine("-----------------");
    }
}

class Sample {

   {
        Console.writeLine("Non-Static initializer 1");
   }

   public Sample()
   {
       Console.writeLine("I'm a default Ctor");
   }

    public Sample(int a)
    {
        this();
        Console.writeLine("I'm a Ctor with parameter int");
    }

    {
        Console.writeLine("Non-Static initializer 2");
    }

    {
        Console.writeLine("Non-Static initializer 3");
    }

}