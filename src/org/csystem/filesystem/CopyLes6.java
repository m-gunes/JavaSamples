package org.csystem.filesystem;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.*;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;

public class CopyLes6 {
    public static void run(String [] args)
    {
        move2(args);
    }

    public static void copy1(String[] args)
    {
        checkLengthEquals(2, args.length, "Wrong number of arguments");

        try {
            Path srcPath = Path.of(args[0]);
            Path destPath = Path.of(args[1]);
            Files.copy(srcPath, destPath);
            Console.writeLine("File successfully copied");
        }
        catch (FileAlreadyExistsException ignore) {
            Console.writeErrLine("File already exists:%s", args[1]);
        }
        catch (IOException e) {
            Console.writeErrLine("IO error occurred:%s", e.getMessage());
        }
        catch (Exception e) {
            Console.writeErrLine("Error occurred:%s", e.getMessage());
        }
    }

    public static void copy2(String[] args)
    {
        checkLengthEquals(2, args.length, "Wrong number of arguments");

        try {
            Path srcPath = Path.of(args[0]);
            Path destPath = Path.of(args[1]);
            Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
            Console.writeLine("File successfully copied");
        }
        catch (DirectoryNotEmptyException ignore) {
            Console.writeErrLine("Non empty directory:%s", args[1]);
        }
        catch (IOException e) {
            Console.writeErrLine("IO error occurred:%s", e.getMessage());
        }
        catch (Exception e) {
            Console.writeErrLine("Error occurred:%s", e.getMessage());
        }
    }

    public static void move1(String[] args)
    {
        checkLengthEquals(2, args.length, "Wrong number of arguments");

        try {
            Path srcPath = Path.of(args[0]);
            Path destPath = Path.of(args[1]);
            Files.move(srcPath, destPath);
            Console.writeLine("File successfully moved");
        }
        catch (FileAlreadyExistsException ignore) {
            Console.writeErrLine("File already exists:%s", args[1]);
        }
        catch (IOException e) {
            Console.writeErrLine("IO error occurred:%s", e.getMessage());
        }
        catch (Exception e) {
            Console.writeErrLine("Error occurred:%s", e.getMessage());
        }
    }

    public static void move2(String[] args)
    {
        checkLengthEquals(2, args.length, "Wrong number of arguments");

        try {
            Path srcPath = Path.of(args[0]);
            Path destPath = Path.of(args[1]);
            Files.move(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
            Console.writeLine("File successfully moved");
        }
        catch (DirectoryNotEmptyException ignore) {
            Console.writeErrLine("Non empty directory:%s", args[1]);
        }
        catch (IOException e) {
            Console.writeErrLine("IO error occurred:%s", e.getMessage());
        }
        catch (Exception e) {
            Console.writeErrLine("Error occurred:%s", e.getMessage());
        }
    }
}
