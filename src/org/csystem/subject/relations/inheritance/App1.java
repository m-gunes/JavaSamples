package org.csystem.subject.relations.inheritance;

public class App1 {
    public static void main(String[] args)
    {
        A x = new A();
        B y = new B();
        C z = new C();

        x.foo();
        x.a = 10;

        System.out.println("-------------------------");

        y.foo();
        y.bar();
        ++y.a;
        y.b = 30;

        System.out.println("-------------------------");

        z.foo();
        z.bar();
        z.tar();
        z.a = 10;
        z.b = 20;
        z.c = 45;
    }
}

class C extends B {
    public int c;

    public void tar()
    {
        System.out.println("C.tar");
    }
}

class B extends A {
    public int b;

    public void bar()
    {
        System.out.println("B.bar");
    }
}

class A {
    public int a;

    public void foo()
    {
        System.out.println("A.foo");
    }
}