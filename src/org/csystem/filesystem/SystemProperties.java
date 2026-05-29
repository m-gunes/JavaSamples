package org.csystem.filesystem;

import org.csystem.util.console.CommandLineArgsUtil;
import org.csystem.util.console.Console;

public class SystemProperties {
    public static void run(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        Console.writeLine("Current working directory:%s", System.getProperty("user.dir"));
        Console.writeLine("OS name:%s", System.getProperty("os.name"));
        Console.writeLine("OS architecture:%s", System.getProperty("os.arch"));
        Console.writeLine("OS version:%s", System.getProperty("os.version"));

        Console.writeLine("File separator:%s", System.getProperty("file.separator"));
        Console.writeLine("System:%s", System.getProperty("file.separator").charAt(0) == '/' ? "Unix/Linux" : "Windows");

        Console.writeLine("Java version:%s", System.getProperty("java.version"));
        Console.writeLine("Java vendor:%s", System.getProperty("java.vendor"));

        Console.writeLine("User name:%s", System.getProperty("user.name"));

        System.setProperty("user.dir", args[0]);
        Console.writeLine("Current working directory:%s", System.getProperty("user.dir"));

    }
}
