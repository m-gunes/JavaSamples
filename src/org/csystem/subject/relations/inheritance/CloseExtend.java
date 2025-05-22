package org.csystem.subject.relations.inheritance;

public class CloseExtend {
    public static void main(String[] args)
    {
        AA x = AA.create();

        x.foo();
    }
}

// final anahtar sözcüğü kullanmadan bir sınıfı türetmeye nasıl kapatırsınız?

//class B extends A { }
// Şüphesiz pratikte bir sınıfı türetmeye kapatmak için final anahtar sözcüğü kullanılır.
// Bu durumda türetme yapılamaması için ctor'un private yapılması gerekir.
class AA {
    private AA()
    {
    }
    // Bu sınıf türünden nesnenin de sınıf dışından yaratılabilmesi için programcı bir factory metot yazabilir.
    public static AA create()
    {
        return new AA();
    }

    public void foo()
    {
        //...
    }
}
