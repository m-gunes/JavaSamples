package org.csystem.app;


import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.random.RandomGenerator;

class App {
    public static void main(String[] args)
    {
        CSDStringBuilder sb = new CSDStringBuilder("Ey dip adana'da pide ye");
        Console.writeLine(StringUtil.isPalindrome(sb));
        CSDStringBuilder sb2 = new CSDStringBuilder("ankara");
        Console.writeLine("Text: %s", sb2.subSequence(2,5));
    }
}
