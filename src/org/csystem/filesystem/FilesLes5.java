package org.csystem.filesystem;


import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;

public class FilesLes5 {
    public static void run(String[] args)
    {
        checkLengthEquals(1, args.length, "Wrong number of arguments");

        Path path = Path.of(args[0]);

        try {
            Files.delete(path);

            if (Files.isDirectory(path))
                Console.writeLine("Directory '%s' deleted", args[0]);
            else
                Console.writeLine("File '%s' deleted", args[0]);
        }
        catch (NoSuchFileException e) {
            Console.writeLine("%s not found", e.getMessage());
        }
        catch (DirectoryNotEmptyException e) {
            Console.writeErrLine("Non empty directory can not be deleted:%s", e.getMessage());
        }
        catch (IOException e) {
            Console.writeErrLine("IO error occurred:%s", e.getMessage());
        }
        catch (Exception e) {
            Console.writeErrLine("Error occurred:%s", e.getMessage());
        }
    }
}
