package org.csystem.subject.generics.question;

public class App {
    public static void main(String[] args)
    {
//        Sample.a = 10;
//        Sample.a = "Ali";
    }
}

class Sample<T> {
    // public static T a; // static context te T yi yakalamanin imkani yok. Static ler scopa dahil degil, generic tur parametreleri icin
    // Cevap: Aşağıdaki demo örnekte static bir veri elemanı, ait olduğu generic sınıfın generic tür parametresi türünden olamayacağından error oluşur
    // Bir sinifin geric turden `static` bir elemani olamiyor. methot gibi generic yapilamiyor.
}



/*
* 1. Error olusur
* 2. Derlenir ekrana Ali yazisi basilir
* 3. Derlenir ekrana 10 yazisi basilir
* 4. Hicbiri
* */

