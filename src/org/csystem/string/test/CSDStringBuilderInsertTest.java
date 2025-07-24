package org.csystem.string.test;

import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;

public class CSDStringBuilderInsertTest {
    public static void run()
    {
        String str = "bugün hava çok karlı değil mi?";
        CSDStringBuilder sb = new CSDStringBuilder(5);

        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        sb.append(str);
        Console.writeLine("(%s)", sb.toString());
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());

        String newStr = "Ali ";
        Console.writeLine("insert(%d,%s)", 6, newStr);
        sb.insert(6, newStr);

        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        Console.writeLine("(%s)", sb.toString());
    }

    public static void main(String[] args)
    {
        run();
    }
}