package org.csystem.subject.relations.aggregation;

/**
 * Aggregation (holds a):<p>
 * A holds B ilişkisi composition ilişkisinin kurallarından en az bir tanesinin genel olarak gerçeklenmediği bütünsel kullanım ilişkisidir.
 */
public class AggregationApp {
    public static void main(String[] args)
    {
        B b1 = new B();
        A a1 = new A(b1);

        a1.doSomething();

        B b2 = new B();
        a1.setB(b2);
    }
}

class A {
    private B m_b;

    public A(B b)
    {
        m_b = b;
    }

    public B getB()
    {
        return m_b;
    }

    public void setB(B b)
    {
        m_b = b;
    }

    public void doSomething()
    {
        m_b.doSomething();
    }
}

class B {
    public void doSomething()
    {
        System.out.println(getClass().getSimpleName());
    }
}
