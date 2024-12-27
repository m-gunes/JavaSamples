package org.csystem.subject.relations.associatin;

/**
 * Association:<p>
 * A nesnesinin B nesnesini ihtiyacı olduğunda kullanması yani bütünsel kullanmaması ilişkisidir.
 * Buradaki kullanım parçalı kullanım (partial usage) biçimindedir.
 *
 */
public class AssociationApp {
    public static void main(String[] args)
    {
        B b1 = new B();
        B b2 = new B();
        A a = new A();
        a.doSomething(b1);
        a.doSomething(b2);
    }
}

class A {
    //..
    public void doSomething(B b)
    {
        b.doSomething();
    }
}

class B {
    public void doSomething()
    {
        System.out.println(getClass().getSimpleName());
    }
}
