package org.csystem.subject.garbagecollector;

public class App {
    public static void main(String[] args)
    {
        Sample s = new Sample(); // rc1: 1
        Mample.foo(s); // rc1: 2 (Argumanlardan parametlere aktarim bir atama islemi olduguna gore (referance count) 2 oldu.) foo() icerisindeki s'den k'ya -> rc1: 3 oldu.
        // rc1: 1 oldu cunku Metot cagirisinin bitmesi yerel degiskenlerin ve parametre degiskenlerinin yok edilmesi demek. s ve k yok edildi.

        Mample.foo(s); // rc1: 2 -> 3
        // rc1: 1

        s = new Sample(); // rc1: 0 (eligible), rc2: 1  (s'de ilk atanan referanstan kopartildi ve rc1: 0 oldu. ama yeni nesne icin yeni bir sayat tutuldu rc2: 1)

        s = null; // rc2: 0 (eligible) (null hic bir nesne tarafindan kullanilmayan/tahsis edilmeyen bir adress) nesneyi gösteren son referans null adres atanarak nesneden kopartıldığından nesne artık eligible duruma gelir.
        // Bir referansa null atandiginda referansin gosterdigi nesne yok edilmiyor.
        // Eger nesneyi gosteren son referansa null atanirsa ancak eligible duruma gelir.
        // Null atamak demek kullanilmayan bir adres atiyorum demek.

        //..

    }
}


class Mample {
    public static void foo(Sample s)
    {
        Sample k;
        k = s;
        //..
    }
}

class Sample {
    //..
}
