package org.csystem.subject;

import org.csystem.util.string.StringUtil;

public class Split {
    public static void main(String[] args)
    {
        runSplitUtil();
    }
    public static void runSplitEx()
    {
        // String s = "Bugün hava çok güzel, çok çok güzel. Yarın nasıl olacak acaba?";
        // String [] str = s.split("[, .]"); // s.split( "[, .]+") Aşağıdaki demo örnekte boş string'lerin diziye eklenmediğini gözlemleyiniz

        // for(int i = 0; i < str.length; ++i)
        //     System.out.printf("(%s)%n", str[i]);

        String ss = "Bugün hava [çok] güzel, [çok] çok güzel. Yarın nasıl olacak acaba?";
        String [] str2 = ss.split("[, .\\]\\[]+");
        for(int i = 0; i < str2.length; ++i)
            System.out.printf("(%s)%n", str2[i]);
    }

    public static void runSplitUtil()
    {
        String s = "Bugün hava [çok] güzel, [çok] çok güzel. Yarın nasıl olacak acaba?";
        String [] str = StringUtil.split(s, ", . ] [");

        for(int i = 0; i < str.length; ++i) {
            System.out.printf("(%s)%n", str[i]);
        }
    }
}
