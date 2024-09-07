package org.csystem.coursework;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması:
	    StringUtil sınıfı içerisinde daha önceden yazılmış olaran changeCase metodunu char türden dizi kullanarak
	    Util isimli bir sınıf içerisinde yazınız. Util sınıfını, test kodlarını ve entry point'i içeren sınıfı
	    tek bir derleme biriminde yazabilirsiniz
-----------------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.string.StringUtil;

public class ChangeCase {
    public static void main(String[] args)
    {
       ChangeCaseTest.run();
    }
}

class ChangeCaseTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Input string:");
            String s = kb.nextLine();

            System.out.printf("%s%n", Util.changeCase(s));

            if ("exit".equals(s))
                break;
        }
    }
}
class Util {
    public static String changeCase(String s)
    {
        // StringBuilder() den daha mi effective? Hayir. Hiz farki yok.
        // toCharArray() yerine StringBuilder kullanilarakta yapilabilirdi. Ex: string -> StringUtil -> changeCase
        // ama bu durumda StringBuilder ile yapmak daha iyi olabilir. Her hangi bir hiz farki yok.
        char [] c = s.toCharArray();

        for(int i = 0; i < c.length; ++i)
            c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);

        return String.valueOf(c);
    }
}










//        for(int i = 0; i < c.length; ++i)
//c[i] = Character.isLowerCase(c[i]) ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);
