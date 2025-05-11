package org.csystem.subject.relations.inheritance;

public class SuperCtor {
    public static void main(String[] args)
    {
        A2 x = new A2();
        System.out.println("---------------------------");
        B2 y = new B2();
        System.out.println("---------------------------");
        B2 z = new B2(10);
        System.out.println("---------------------------");
        C2 t = new C2();
        System.out.println("---------------------------");
        C2 u = new C2(10, 20);
        System.out.println("---------------------------");
    }
}

class C2 extends B2 {
    public C2()
    {
       super(); // To write or not to write means the same thing
       System.out.println("I am a default constructor of C2");
    }
    public C2(int b, int c)
    {
        super(b);
        System.out.println("I am a constructor of C2 with parameter types int, int");
    }
}

class B2 extends A2{
    public B2()
    {
        super(); // To write or not to write means the same thing
        System.out.println("I am a default constructor of B2");
    }

    public B2(int b)
    {
        super(b);
        System.out.println("I am a constructor of B2 with a parameter type int");
    }
}

class A2 {
    public A2()
    {
        System.out.println("I am a default constructor of A2");
    }
    public A2(int a)
    {
        System.out.println("I am a constructor of A2 with a parameter type int");
    }
}
