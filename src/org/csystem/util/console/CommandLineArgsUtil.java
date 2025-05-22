package org.csystem.util.console;

public final class CommandLineArgsUtil {
    private CommandLineArgsUtil()
    {
    }

    public static void checkLengthEquals(int len, int argsLen, String message)
    {
        checkLengthEquals(len, argsLen, message, 1);
    }

    public static void checkLengthEquals(int len, int argsLen, String message, int exitCode)
    {
        if(len != argsLen) {
            System.err.println(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthGreater(int len, int argsLen, String message)
    {
        checkLengthGreater(len, argsLen, message, 1);
    }

    public static void checkLengthGreater(int len, int argsLen, String message, int exitCode)
    {
        if(len <= argsLen) {
            System.err.println(message);
            System.exit(exitCode);
        }
    }
}
