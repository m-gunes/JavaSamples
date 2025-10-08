package org.csystem.subject.generics.examples;

import org.csystem.util.console.Console;

public class App4 {
    public static void main(String[] args)
    {
        runLample();
    }

    public static void runZample()
    {
        Zample<Integer> z = new Zample<>();
        z.foo(6, "Ankara");
        z.foo(6, 7);
    }
    public static void runLample()
    {
        Lample.foo(10);
        Lample.<Integer>foo(10);
        Lample.foo((Integer)10);
        Lample.foo("Ankara");
        Lample.<String>foo("Ankara");
        Lample.foo((Object)"Ankara");
        Lample.foo(new StringBuilder("Ankara"));
    }
    public static void runMample()
    {
        Mample m = new Mample();
        m.foo(10);
        m.foo("Ankara");
        m.<String>foo("istanbul");
        Mample.bar(34, "istanbul");
        Mample.bar("Ali", "Veli");
        Mample.<Integer, String>bar(68, "Aksaray");
    }
}

class Zample<T> {
    public <K> void foo(T t, K k)
    {
    }
    public static <T,K> void bar(T t, K k) //<T> class'in <T> si degil
    {
        // Yani generic sınıfın generic tür parametre isminin faaliyet alanına (scope) static metotlar dahil değildir.
    }
}

class Lample {

    public static <T> void foo(T t)
    {
        Console.writeLine("T -> %s", t);
    }

    public static void foo(int a)
    {
        Console.writeLine("int -> %d",a);
    }

    public static void foo(String s)
    {
        Console.writeLine("String -> %s", s);
    }
}


class Mample {
    public <T> void foo(T t)
    {
        Console.writeLine(t);
    }

    public static <T,K> void bar(T t, K k)
    {
        Console.writeLine(t);
        Console.writeLine(k);
    }
}

