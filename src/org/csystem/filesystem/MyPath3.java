package org.csystem.filesystem;

import org.csystem.util.console.CommandLineArgsUtil;
import org.csystem.util.console.Console;

import java.io.File;

public class MyPath3 {

    public static void run(String [] args)
    {
        listFiles(args);
    }

    private static void getAbsolutePathEx(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);

        Console.writeLine("getAbsolutePath(): %s", file.getAbsolutePath());
        Console.writeLine("getName(): %s", file.getName());
        Console.writeLine("getParent(): %s", file.getParent());
        Console.writeLine("getParentFile(): %s", file.getParentFile());

        /*
         getParent ve getParentFile metotları, içerisinde hiç / ve \ olmayan bir yol ifadesi ile yaratılmış File nesnesinden elde ediliyorsa null değere dönerler.
         Bu durumda en iyi yöntem getAbsoluteFile metodu ile mutlak yol ifadesine ilişkin File referansı alınıp getParent veya getParentFile çağrılmalıdır.
         */

        Console.writeLine("getAbsoluteFile(): %s", file.getAbsoluteFile());
        Console.writeLine("get parent with getAbsoluteFile(): %s", file.getAbsoluteFile().getParent());
        Console.writeLine("get parent file with getAbsoluteFile(): %s", file.getAbsoluteFile().getParentFile());

        Console.writeLine("--------------------");

        Console.writeLine("Absolute Path:%s", file.getAbsolutePath());
        Console.writeLine("Absolute Path:%s", file.getAbsoluteFile().getAbsolutePath());
        Console.writeLine("Parent:%s", file.getParent());
        Console.writeLine("Parent:%s", file.getParentFile() == null ? "null" : file.getParentFile().getAbsolutePath());
        Console.writeLine("Parent:%s", file.getAbsoluteFile().getParent());
        Console.writeLine("Parent:%s", file.getAbsoluteFile().getParentFile().getAbsolutePath());
        Console.writeLine("Name:%s", file.getName());
    }

    private static void deleteEx(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);

        if (file.exists()) {
            boolean result = file.delete();
            if (file.isDirectory()) {
                if (result)
                    Console.writeLine("Directory '%s' deleted", args[0]);
                else
                    Console.writeLine("Directory '%s' can not be deleted", args[0]);
            }
            else {
                if (result)
                    Console.writeLine("File '%s' deleted", args[0]);
                else
                    Console.writeLine("File '%s' can not be deleted", args[0]);
                // bunun niye silinemediginini file sinifi ile anlamanin imkani yok. isletim sistemi ile alakali. Belki silme yetkisi yok
            }
        }
        else
            Console.writeLine("%s not found", args[0]);
    }

    private static void list(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        if (file.exists()) {
            if (file.isDirectory()) {
                String [] files = file.list();

                if (files != null)
                    for (var f : files)
                        Console.writeLine(f);
                else
                    Console.writeLine("IO problem occurred");
            }
            else
                Console.writeLine("'%s' is not a directory", file.getAbsolutePath());

        }
        else
            Console.writeLine("%s not found", args[0]);
    }
    private static void listFiles(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "Wrong number of argument");
        var file = new File(args[0]);
        if (file.exists()) {
            if (file.isDirectory()) {
                File [] files = file.listFiles();

                if (files != null)
                    for (var f : files)
                        Console.writeLine(f.getAbsolutePath());
                else
                    Console.writeLine("IO problem occurred");
            }
            else
                Console.writeLine("'%s' is not a directory", file.getAbsolutePath());

        }
        else
            Console.writeLine("%s not found", args[0]);
    }
}
