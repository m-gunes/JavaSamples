package org.csystem.util.console;

import java.util.Scanner;

public class Console {
    private Console()
    {
    }

    private static final Scanner KB = new Scanner(System.in);

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        return readInt(prompt, "");
    }

    public static int readInt(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(KB.nextLine());
            } catch (NumberFormatException ignore) {
                System.out.println(errorPrompt);
            }
        }
    }

    public static long readLong()
    {
        return readLong("");
    }

    public static long readLong(String prompt)
    {
        return readLong(prompt, "");
    }

    public static long readLong(String prompt, String errorPrompt)
    {
        while (true) {

            try {
                System.out.print(prompt);
                return Long.parseLong(KB.nextLine());
            } catch (NumberFormatException ignore) {
                System.out.println(errorPrompt);
            }
        }

    }

    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String prompt)
    {
        return readDouble(prompt, "");
    }

    public static double readDouble(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.println(errorPrompt);
            }
        }
    }

    public static String readString(String prompt)
    {
        System.out.print(prompt);
        return KB.nextLine();
    }

    public static char readChar()
    {
        return readChar("");
    }

    public static char readChar(String msg)
    {
        return readChar(msg, "");
    }

    public static char readChar(String msg, String errMsg)
    {
        for (;;) {
            write(msg);
            var str = KB.nextLine();

            if (str.isEmpty())
                return '\n';

            if (str.length() == 1)
                return str.charAt(0);

            write(errMsg);
        }
    }

    public static void write(Object o)
    {
        System.out.print(o);
    }

    public static void write(String format, Object...args)
    {
        System.out.printf(format, args);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void writeLine(Object o)
    {
        System.out.println(o);
    }

    public static void writeLine(String format, Object...args)
    {
        write(format + "%n", args);
    }

    public static void writeErr(Object o)
    {
        System.err.print(o);
    }

    public static void writeErr(String format, Object...args)
    {
        System.err.printf(format, args);
    }

    public static void writeErrLine()
    {
        System.err.println();
    }

    public static void writeErrLine(Object o)
    {
        System.err.println(o);
    }

    public static void writeErrLine(String format, Object...args)
    {
        writeErr(format + "%n", args);
    }

}
