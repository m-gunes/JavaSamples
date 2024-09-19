package org.csystem.subject;


/*----------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: For-each döngü deyimi bir dizi için ne zaman tercih edilmemelidir?
    Aslında bu sorunun cevabı oldukça basittir. Ne zaman dizi için indeks gerekirse o zaman for-each kullanılmamalıdır.
    Bu durumda tersten söylersek, indeks gerekmediği her durumda for-each kullanılmalıdır*

    for-each döngü deyiminde `:` den sonraki ifade döngünün başında bir kez hesaplanır.
----------------------------------------------------------------------------------------------------------------*/

public class ForEach {
    public static void main(String[] args)
    {
        stringToCharArr();
    }

    public static void implicitConversionErr()
    {
        int [] a =  {1, 2, 3, 4, 5, 6, 7};
        // for(short val : a) // for-each döngü deyiminde döngü değişkenine atama implicit olarak yapıldığından aşağıdaki örnekte error oluşur
        //     System.out.println(val);

    }

    public static void validImplicitConversion()
    {
        int [] a =  {1, 2, 3, 4, 5, 6, 7};
        for(long val : a)
            System.out.println(val);
    }

    public static void onlyOnceCalc()
    {
        for(int val : SampleForeach.getArray()) //  for-each döngü deyiminde `:` den sonraki ifade döngünün başında bir kez hesaplanır.
            System.out.printf("%d ", val);
    }

    public static void stringArr()
    {
        String [] s = {"Istanbul", "Ankara", "Izmir"};
        for(String val : s)
            System.out.printf("%s ", val);
    }

    public static void stringNotIterable()
    {
        // String sınıfı "iterable" bir sınıf olmadığından for-each ile aşağıdaki gibi kullanılamaz
        String s = "Ankara";
        // for(String val : s) // Foreach not applicable to type 'java.lang.String'
        //     System.out.printf("%s ", val);
    }

    public static void stringToCharArr()
    {
        // Aşağıdaki örnekte String sınıfının toCharArray metodu çağrılarak char türden dizi dolaşılmıştır
        String s = "Ankara";
        for(char c : s.toCharArray())
            System.out.printf("%c ", c);
    }

}

class SampleForeach {
    public static int [] getArray()
    {
        System.out.println("getArray");
        return new int[] {1,2,3,4,5,6,7};
    }
}