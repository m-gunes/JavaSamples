package org.csystem.subject.singleton;

/**----------------------------------------------------------------------------------------------------------------
    Tasarım Kalıpları
        <p>Özellikle NYPT ilerledikçe bazı programcılar bir takım problemlere gene çözümler üretme çabasına girmişlerdir.
        Bu anlamda Gang of Four (GoF) olarak anılan 4 bilim insanı bir grup genel problemi çözümleriyle birlikte kategorize
        etmişlerdir. Bu tip genel çözümlere tasarım kalıpları (design patterns) denilmektedir. GoF pattern'lerinden sonra da
        pek çok patttern tasarlanmıştır.

     <p>

    Singleton Tasarım Kalıbı:
        <p>Singleton GoF'un nesne yaratan (creational) kalıplarından biridir. Problemin tanımı şu şekilde verilebilir:
        Öyle bir sınıf olsun ki o sınıf türünden program boyunca yalnızca bir tane nesne yaratılabilsin ve istenildiği
        zaman o nesne referansı elde edilebilsin.


    <p>Singleton kalıbının bir implementasyonu. Dikkat edilirse bu implementasyonda ilgili nesne ilk getInstance çağrısında
    yaratılmaktadır. Bu durumda getInstance çağrılmadığı sürece nesne yaratılmamaktadır.
    Bu sebeple buna lazy implementation da denilmektedir
----------------------------------------------------------------------------------------------------------------*/



public class SingletonLazyImplementationApp {
    public static void main(String[] args)
    {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {
    public static Singleton ms_instance;
    //..

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if(ms_instance == null)
            ms_instance = new Singleton();

        return ms_instance;
    }

    //..
}


