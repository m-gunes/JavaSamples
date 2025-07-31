package org.csystem.subject.polymorphism.augmentation.accessmodifier;

public class App {
}

class H extends A {
    public void car() // bu overide anlamina gelmez. Override edilebilmesi icin taban siniftan cagirilabilmesi lazim. Private oldugu icin sinif disindan erisim yapilamaz!
    {} // bu yeni bir method anlamina geliyor.
}

class G extends A {
    public void tar() // override edebilir. yani daha da erisim belirleyiciyi yukseltebilir.
    {}
}

class F extends A {
    protected void tar() // override edilebilir. cunku burada erisim belirleyici yukseltiliyor. Yukseltilir ama dusurulemez.
    {}
}

class E extends A {
    //protected void foo() // Error, erisim olarak protected, public'ten daha dusuktur. Override edilemez
    //{}
}

class D extends A {
    //void bar() // Error, erisim belirleyicisi dusurulemez
    //{}
}

class C extends A {
    protected void bar() // override edilebilir
    {}
}

class B extends A {
    public void bar() // override edilebilir
    {}
}

class A {
    public void foo()
    {}

    protected void bar()
    {}

    void tar()
    {}

    private void car()
    {}
}
