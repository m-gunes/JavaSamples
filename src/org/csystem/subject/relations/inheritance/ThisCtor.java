package org.csystem.subject.relations.inheritance;

public class ThisCtor {
    public static void main(String[] args)
    {
        A3 x = new A3();
        System.out.println("---------------------------");
        A3 y = new A3(10);
        System.out.println("---------------------------");
        A3 z = new A3("Ankara");
        System.out.println("---------------------------");
    }
}

class B3 extends A3 {
   public B3()
   {
       super(0);
       System.out.println("I am a default constructor of B3");
   }
   public B3(int b)
   {
       this();
       // super(0); // Error
       System.out.println("I am a constructor of B3 with parameter type int");

   }
}

class A3 extends Object{
    public A3()
    {
        this("");
        System.out.println("I am a default constructor of A3");
    }

    public A3(int a)
    {
        this();
        System.out.println("I am a constructor of A3 with a parameter type int");
    }

    public A3(String b)
    {
        System.out.println("I am a constructor of A3 with a parameter type String");
    }
}
