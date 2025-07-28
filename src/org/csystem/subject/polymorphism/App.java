package org.csystem.subject.polymorphism;

import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

public class App {
    public static void main(String [] args)
    {
        DemoApp.run();
    }
}

class DemoApp {
    public static void run()
    {
        AFactory factory = new AFactory();
        while (true) {
            A x = factory.create(); // x'e degilde burada gecici degiskene yapilan atama upcasting
            Util.doSomething(x); // x'in dynamic turu run-time da a,b,c,d,e,f olabilir
            ThreadUtil.sleep(1000);
        }
    }
}

class Util {
    public static void doSomething(A a) // A disinda hic birseye dependent degil
    {
       Console.writeLine("------------------------------");
       Console.writeLine("Dynamic Type: %s", a.getClass().getName());
       a.foo(10); // Todo: Don't forget and repeat time to time! //  burasi virtual method cagrisi
        /**
         * Derleyiciyi burada A sinifina gitti en uygun metodu buldu ama bu metodun sanal oldugunu anladi.
         * Derleyici calisma zamanina (run-time) byte code diyorki:
         * Calisma zamaninda A'nin dinamik turune bak (A,B,C,D,E,F) olabilir.
         * Yani A'dan tureyen siniflar upcasting yapilabildigi icin (upcasting: turemisten tabana implicit conversion yapilir. Zaten dinamik turu olusturanda budur)
         *
         * Aslinda ne kodu uretiliyor:
         * Akis buraya geldiginde. a.foo(10) metodu cagrildiginda, foo metodunu cagiran referansin dinamik turune bak, eger orda varsa onu cagir
         * Diyelim ki dinamik tur B. B'de foo varsa onu cagir, Run-time'da.
         */
       Console.writeLine("------------------------------");
    }
}

class AFactory {
    private final Random m_random = new Random();

    public A create()
    {
       return switch (m_random.nextInt(7)) {
           case 0 -> new B();
           case 1 -> new C();
           case 2 -> new D();
           case 3 -> new E();
           case 4 -> new F();
           case 5 -> new F();
           default -> new A();
       };
    }
}

class G extends B {
    //..
}

class F extends C {
    //..
}

class E extends C {
    public void foo(int a) // override
    {
        Console.writeLine("E.foo");
    }
}

class D extends B {
    public void foo(int a) // override
    {
        Console.writeLine("D.foo");
    }
}

class C extends A {
    //..
}

class B extends A {
    public void foo(int a) // override
    {
        Console.writeLine("B.foo");
    }
}

class A {
    public void foo(int a) // virtual method
    {
        Console.writeLine("A.foo");
    }

    public final void tar() // non-virtual
    {

        Console.writeLine("A.tar");
    }

    public static void bar(int a) // non-virtual
    {
        Console.writeLine("A.bar");
    }
}