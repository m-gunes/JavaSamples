package org.csystem.subject.relations.inheritance.upcasting;

public class App {
    public static void main(String[] args)
    {
        B1 x = new B1();
        A1 y;

        x.a = 20;
        x.b = 30;

        y = x; // upcasting
        System.out.printf("x.a = %d, x.b = %d%n", x.a, x.b);
        System.out.printf("y.a = %d%n", y.a);
        System.out.println("-------------------------------");

        ++y.a;
        System.out.printf("x.a = %d, x.b = %d%n", x.a, x.b);
        System.out.printf("y.a = %d%n", y.a);
        System.out.println("-------------------------------");

        ++x.a;
        System.out.printf("x.a = %d, x.b = %d%n", x.a, x.b);
        System.out.printf("y.a = %d%n", y.a);
        System.out.println("-------------------------------");
    }
}

class B1 extends A1 {
    public int b;
}

class A1 {
    public int a;
}