package org.csystem.subject.relations.inheritance.upcasting;

import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

public class TypeIndependent {

    public static void main(String[] args)
    {
        DemoApp.run();
    }
}

class DemoApp {
    public static void run()
    {
        AFactory factory = new AFactory();
        while (true) {
            System.out.println("-----------------------------------");
            A a = factory.create();

            Sample.doWork(a);
            System.out.println("-----------------------------------");
            ThreadUtil.sleep(1000);
        }
    }
}

class Sample {
    public static void doWork(A a)
    {
        System.out.printf("a.x = %d%n", a.x);
    }
}

class AFactory {
    private final Random m_random = new Random();
    public A create()
    {
        return switch (m_random.nextInt(6)) {
            case 0 -> new B();
            case 1 -> new C();
            case 2 -> new D();
            case 3 -> new E();
            case 4 -> new F();
            default -> new A();
        };
    }
}

class F extends C {
    public int k;
    public F()
    {
        System.out.println("F");
    }
}

class E extends B {
    public int z;
    public E()
    {
        System.out.println("E");
    }
}

class D extends A {
    public int t;
    public D()
    {
        System.out.println("D");
    }
}

class C extends B {
    public int z;
    public C()
    {
        System.out.println("C");
    }
}

class B extends A {
    public int y;
    public B()
    {
        System.out.println("B");
    }
}

class A {
    public int x;
    public A()
    {
        System.out.println("A");
    }
}