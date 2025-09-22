package org.csystem.subject.interfaces.casting;

/**
 *
 * Bir arayüz referansının herhangi bir sınıf türüne dönüştürülmesi explicit olarak yani tür dönüştürme operatörü ile yapılır. Ancak çalışma zamanı sırasında arayüz referansının dinamik türünün dönüştürülecek sınıfı kapsayıp kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür, akış devam eder. Kapsamıyorsa haksız dönüşümdür, ClassCastException fırlatılır
 */
public class InValidCasting {
    public static void main(String[] args)
    {

        AAA a = new AAA();
        Ixxx ix;
        ix = a;
        BB b = (BB)ix; // invalid casting
    }
}

class AAA implements Ixxx {

}

class BB {}

interface Ixxx {

}