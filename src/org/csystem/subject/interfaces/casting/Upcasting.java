package org.csystem.subject.interfaces.casting;

/**
 * Bir sınıf referansının onun desteklediği (implementation) bir arayüz referansına dönüştürülmesi.
 * <p>
 * Bir sınıf referansının onun desteklediği (implementation) bir arayüz referansına dönüştürülmesi doğrudan (implicit) yapılabilir. Bu durum arayüz referansının taban sınıf referansı gibi kullanılmasıdır. Zaten arayüzün hedeflerinden biri de budur
 */
public class Upcasting {
    public static void main(String[] args)
    {
        A a = new A();
        IX ix;
        ix = a; // interface referansi, taban sinif referansi gibi kullanilmaktadir. Zaten interface'in hedeflerinden biride budur.
    }
}


class A implements IX {
}

interface IX {
}