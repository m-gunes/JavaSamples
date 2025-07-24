package org.csystem.string.test;

import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;

public class CSDStringBuilderIndexOfTest {
    public static void run()
    {
        String str = "bugün hava çok karlı değil mi?";
        CSDStringBuilder sb = new CSDStringBuilder(5);

        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        sb.append(str);
        Console.writeLine("(%s)", sb.toString());
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        Console.writeLine("indexOf(%s):%d", "hava", sb.indexOf("hava"));
    }

    public static void main(String[] args)
    {
        run();
    }
}