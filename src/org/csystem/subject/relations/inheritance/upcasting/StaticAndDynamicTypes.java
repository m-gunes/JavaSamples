package org.csystem.subject.relations.inheritance.upcasting;

import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

/**
 * Static ve Dinamik Türler
 * <p>
 * Bir referans değişkenin iki tane türü vardır: statik tür (static type), dinamik (dynamic type). Referansın bildirildiği türe statik tür (static type) denir. Derleme zamanına ilişkindir ve faaliyet alanı boyunca bu tür değişmez. Referansın türü dendiğinde statik tür anlaşılır. Referansın gösterdiği adresteki nesnenin gerçek türüne dinamik tür (dynamic type) denir. Çalışma zamanına ilişkindir, değişebilir.
 * <p></p>
 * Anahtar Notlar: Bir referansın dinamik türünün nitelikli (fully qualified) ismi bir String olarak aşağıdaki kalıp ile elde edilebilir:
 * <p>
 * <referans>.getClass().getName();
 */
public class StaticAndDynamicTypes {
    public static void main(String[] args)
    {
        DemoApp2.run();
    }
}

class DemoApp2 {
    public static void run()
    {
        AFactory factory = new AFactory();

        A a;

        while (true) {
            System.out.println("-----------------------------------");
            a = factory.create();
            System.out.printf("Dynamic type:%s%n", a.getClass().getName());
            System.out.println("-----------------------------------");
            ThreadUtil.sleep(1000);
        }
        //...
    }
}

class BFactory {
    private final Random m_random = new Random();

    public A2 create()
    {
        return switch (m_random.nextInt(6)) {
            case 0 -> new B2();
            case 1 -> new C2();
            case 2 -> new D2();
            case 3 -> new E2();
            case 4 -> new F2();
            default -> new A2();
        };
    }
}

class F2 extends C2 {
    //...
}

class E2 extends B2 {
    //...
}

class D2 extends A2 {
    //...
}

class C2 extends B2 {
    //...
}

class B2 extends A2 {
    //...
}

class A2 {
    //...
}