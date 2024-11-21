package org.csystem.subject;

/*
    Bir enum sınıfına sabitler dışında da eleman eklenebilmektedir.
    Bir enum sınıfına eleman eklemek için son sabitten sonra noktalı virgül konmalıdır.
    Bir enum sınıfına, klasik sınıflarda olduğu gibi veri elemanı, ctor ve metot eklenebilir.
    Bir enum sınıfına programcı tarafından hiç ctor eklenmemişse, default ctor derleyici tarafından otomatik olarak içi boş olarak yazılır.
    Ancak burada klasik sınıflarda olduğu public olarak yazılmaz.
    Zaten bir enum sınıfına programcı tarafından public ya da protected bir ctor yazılması geçersizdir.
    Bir enum sınıfına programcı ya private olarak ya da no-modifier olarak istediği kadar ctor ekleyebilir.
    Bir enum sınıfında ctor'un no-modifier olması private olarak bildirilmesiyle aynı anlamdadır.
    Genel olarak programcılar bir enum sınıfına yazdıkları ctor'u no-modifier olarak bildirirler.
    Bu durum yalnızca ctor için geçerlidir.
    Bir enum sınıfına eklenen diğer elemanlar için erişim belileyiciler klasik sınıflar ile aynıdır.
    Aslında bir enum sınıfı için ctor erişim anlamında private'ın da ötesindedir.
    Bir enum türünden nesne hiç bir yerde programcı tarafından yaratılamaz.
    Yani bir enum türünden nesne sayısı o enum türüne ait enum sabiti sayısı kadardır.

    Bir enum sınıfında sabiti doğrudan bildirmek veya sabit isminden sonra içi boş parantez () koymak aynı anlamdadır
    ve bu sabite ilişkin referansın gösterdiği nesnenin default ctor çağrılarak yaratılacağı anlamına gelir.
 */

import java.util.Random;

public class EnumClasses2 {
    public static void main(String[] args)
    {
        Color2 color1 = Color2.randomColor(new Random());
        System.out.println("-----------");
        Color2 color2 = Color2.randomColor(new Random()); // color2 yaratildiginda ctor tekrar cagrilmiyor.

        System.out.println(color1.toString());
        System.out.println(color2.toString());

    }
}

enum Color2 {
    RED(), GREEN(), BLUE(), WHITE, BLACK;
    private static final Color2 [] VALUES = values();

    Color2()
    {
        System.out.println("I am a default ctor.");
    }

    public static Color2 randomColor(Random random)
    {
        return VALUES[random.nextInt(VALUES.length)];
    }
}