package org.csystem.filesystem;

import org.csystem.util.console.CommandLineArgsUtil;
import org.csystem.util.console.Console;

import java.io.File;

public class MyFiles4 {
    public static void run(String[] args)
    {
        mkdirs(args);
    }

    private static void fileLength(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        if (file.exists()) {
            if (file.isDirectory()) {
                File [] files = file.listFiles();
                if (files != null)
                    for (var f : files)
                        Console.writeLine("%s %s", f.getName(), f.isDirectory() ? "<DIR>" : "%s B".formatted(f.length()));
                else
                    Console.writeLine("IO problem occurred");
            }
            else
                Console.writeLine("'%s' is not a directory", file.getAbsolutePath());
        }
        else
            Console.writeLine("%s not found", args[0]);
    }

    private static void mkdir(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        Console.writeLine(file.mkdir() ? "Created" : "Not created");
    }

    private static void mkdirWithExistPath(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        if (file.getAbsoluteFile().getParentFile().exists())
            Console.writeLine(file.mkdir() ? "Created" : "Not created");
        else
            Console.writeLine("'%s' not exist", file.getAbsoluteFile().getParentFile().getAbsolutePath());
    }

    private static void mkdirs(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        Console.writeLine(file.mkdirs() ? "Created" : "Not created");
    }
}
