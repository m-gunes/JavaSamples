package org.csystem.subject.interfaces.casting;

/**
 * Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi
 * <p>
 * Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi explicit olarak yani tür dönüştürme operatörü ile yapılır. Ancak çalışma zamanı sırasında arayüz referansının dinamik türünün dönüştürülecek sınıfı kapsayıp kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür, akış devam eder. Kapsamıyorsa haksız dönüşümdür, ClassCastException fırlatılır
 */
public class ValidCasting {

    public static void main(String[] args)
    {
        AA a = new AA();
        IXX ix;
        ix = a;
        B b = (B) ix; // haklı dönüşüm
    }
}

class AA extends B implements IXX {

}

class B {

}

interface IXX {

}

