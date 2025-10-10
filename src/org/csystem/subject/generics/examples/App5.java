package org.csystem.subject.generics.examples;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class App5 {
    public static void main(String[] args) {
        runVersion3();
    }

    public static void runVersion4() {
        int [] a = ArrayUtil.generateRandomArray(new Random(), 10, 10, 20);

        for (int val : a)
            Console.writeLine(a);

        Console.writeLine("\n////////");

        int length = Console.readInt("Input length:");

        Arrays.stream(a).filter(v -> v > length).forEach(v -> Console.write("%d ", v);
        Console.writeLine();
    }

    public static void runVersion3() {
        int [] a = ArrayUtil.generateRandomArray(new Random(), 10, 10, 20);

        for (int val : a)
            Console.writeLine(a);

        Console.writeLine("\n////////");

        int length = Console.readInt("Input length:");

        GreaterPredicate greaterPredicate = new GreaterPredicate(length);
        WriteIntConsumer writeIntConsumer = new WriteIntConsumer();
        Arrays.stream(a).filter(greaterPredicate).forEach(writeIntConsumer);
        Console.writeLine();
    }

    public static void runVersion2() {

        String [] str = StringUtil.generateRandomTextsTR(new Random(), 10, 5, 11);

        for (String s : str)
            Console.writeLine(s);

        Console.writeLine("////////");

        int length = Console.readInt("Input length:");

        Arrays.stream(str).filter(s -> s.length() > length).forEach(Console::writeLine);
    }

    public static void runVersion1() {

        String [] str = StringUtil.generateRandomTextsTR(new Random(), 10, 5, 11);

        for (String s : str)
            Console.writeLine(s);

        Console.writeLine("////////");

        int length = Console.readInt("Input length:");
        LengthPredicate lengthPredicate = new LengthPredicate(length);
        StringConsumer stringConsumer = new StringConsumer();

        Arrays.stream(str).filter(lengthPredicate).forEach(stringConsumer);
    }
}


class WriteIntConsumer implements IntConsumer {
    public void accept(int a)
    {
        Console.write("%d ",a);
    }
}

class GreaterPredicate implements IntPredicate {
    private final int m_length;

    public GreaterPredicate(int length)
    {
        m_length = length;
    }

    public boolean test(int a)
    {
        return a > m_length;
    }
}


class StringConsumer implements Consumer<String> {
    public void accept(String s)
    {
        Console.writeLine(s);
    }
}

class LengthPredicate implements Predicate<String> {
    private final int m_length;

    public LengthPredicate(int length)
    {
        m_length = length;
    }

    public boolean test(String s)
    {
        return s.length() > m_length;
    }
}


