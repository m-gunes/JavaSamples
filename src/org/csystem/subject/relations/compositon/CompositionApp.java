package org.csystem.subject.relations.compositon;

public class CompositionApp {
    public static void main(String[] args)
    {
        A a = new A();
        a.doSomething();
    }

}

/**
 * Composition (has a): A has a B ilişkisinde aşağıdaki iki koşulun gerçeklenmesi gerek ve yeterdir:
 * <p>A nesnesine ait B nesnesi başka bir nesne tarafından kullanılamayacak.
 * <p>A nesnesine ait B nesnesi ömrüne hemen hemen A nesnesi başlayacak ve ömrü hemen hemen A nesnesi ile son bulacak.
 * Burada, B nesnesi ait olduğu A nesnesi tarafından gerektiğinde(yani istenildiği zaman) kullanılabilecektir.
 * Bu tarz kullanıma bütünsel kullanım (whole usage) denir.
 */
class A {
    private B m_b; // whole usage

    public A()
    {
        m_b = new B();
    }

    public void doSomething()
    {
        m_b.doSomething();
        //..
    }
}

class B {
    public void doSomething()
    {
        //..
        System.out.println(getClass().getSimpleName());
    }
}
