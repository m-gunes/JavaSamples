package org.csystem.subject.wrapper.autoboxing;

public class App {
    public static void main(String[] args)
    {
        convertingPrimitiveTypes();
    }

    private static void interviewQuestion()
    {
        // Ekran ciktisi ne olur?
        Object o = 12; // auto-boxing: Integer.valueOf(12);
        // `o`'nun dinamik turu ne? Integer! int degil Integer. Integer, Long turune donusemez. Invalid casting.
        // ama int long'a ataniyor. Evet int, long'a atanir fakat Integer, Long'a atanamaz! Cunku Integer ve Long birer sinif ve aralarinda turetme iliskisi yok!
        // Integer can not be cast Long

        //Object o = 12; bu bir auto-boxing. Derleyici Object'te atanan ifadenin turunu tespit ediyor. Buradaki ifadenin turu int (derleme zamaninda).
        // Bunun int oldugunu gordugunde int'in sarmalayan sinifi olan Integer ile sarmalayip Integer turden bir referansi `o` referansina atamis oluyor.

        // 12 sabit bir ifade ve turu int. Object referansina temel turden bir ifade atandiginda otomatik olarak arka planda bir kod uretilecek, auto-boxing, Integer.valueOf(12);
        // (long)o -> Object'ten temel bir ture, bir tur donusturme operatoru uygulandiginda auto-unboxing. down cast yapilip ilgili metodun cagirilmasi

        long a;
        a = (long)o; // auto-unboxing: ((Long)o).longValue();
        // Long a down cast yap ve longValue yu cagir.
        // runtime'da (Long)o cakiliyor

        // Peki bu hatayi nasil cozeriz?
        // a = (int)o; //auto-unboxing: ((Integer)o).intValue();
        // cunku int, long'a atanir. int turden bir ifade long turune implicit olarak donusebilir.
        System.out.printf("a = %d%n", a);
    }

    private static void interviewQuestion2()
    {
        Object o = 12; //auto-boxing: Integer.valueOf(12);
        short a;

        // a = (short)o; Bu yine exception. Bunu tek hamlede nasil duzeltiriz? -> (short)(int)o
        // a = (short)(int)o; -> Bir baska soru: bu ifadeyi teknik olarak anlatin?
        a = (short)(int)o; //auto-unboxing: (short)((Integer)o).integerValue();
        // dönüştürme operatörü right associative bir operatordur. Burada once int, sonra int'i short'a type cast yap.
        System.out.printf("a = %d%n", a);
    }
    private static void convertingPrimitiveTypes()
    {
        Long iVal = 5_000_000_000L; // Long.valueOf(5_000_000_000L);
        long val = 5_000_000_000L;
        int a, b;
        a = iVal.intValue();
        b = (int)val;
        System.out.printf("%016X%n", 5_000_000_000L);
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a = %9X, b = %08X%n", a, b);
    }
}


