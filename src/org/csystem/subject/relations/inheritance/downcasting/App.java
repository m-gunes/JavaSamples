package org.csystem.subject.relations.inheritance.downcasting;

import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

public class App {
    public static void main(String[] args)
    {
        DemoApp.run();

    }
}


class DemoApp {
    public static void run()
    {
        AFactory factory = new AFactory();

        A x;

        while (true) {
            System.out.println("-----------------------------------");
            x = factory.create();
            String name = x.getClass().getName();
            System.out.printf("Dynamic type:%s%n", name);

            if (name.equals("org.csystem.subject.relations.inheritance.downcasting.B")) {
                B y = (B)x; // downcasting
                y.b = 20;
            } else
                System.out.println("Invalid casting");



            System.out.println("-----------------------------------");
            ThreadUtil.sleep(1000);
        }
        //...
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
    public int f;
    //...
}

class E extends B {
    public int e;
    //...
}

class D extends A {
    public int d;
    //...
}

class C extends B {
    public int c;
    //...
}

class B extends A {
    public int b;
    //...
}

class A {
    public int a;
    //...
}