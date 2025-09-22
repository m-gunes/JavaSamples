package org.csystem.subject.interfaces.enums;

import org.csystem.util.console.Console;

import java.util.Random;

public class App {
    public static void main(String[] args)
    {
        SampleFactory sampleFactory = new SampleFactory();
        Sample sample = sampleFactory.create();

        Console.writeLine("Sample: %s", sample);
        Console.writeLine(sample.foo(3));
    }
}

class SampleFactory {
    private static final Sample [] VALUES = Sample.values();
    private final Random m_random = new Random();

    public Sample create()
    {
        return switch (m_random.nextInt(VALUES.length)) {
           case 0 -> Sample.AA;
           case 1 -> Sample.BB;
           case 2 -> Sample.CC;
           default -> Sample.DD;
        };
    }
}

enum Sample implements IX {
    AA {
        public int foo(int a)
        {
            Console.writeLine("Enum constant: %s",toString());
            return ordinal() + a;
        }
    }, BB {
        public int foo(int a)
        {
            Console.writeLine("Enum constant: %s",toString());
            return ordinal() + a;
        }
    }, CC {
        public int foo(int a)
        {
            Console.writeLine("Enum constant: %s",toString());
            return ordinal() + a;
        }
    }, DD;

    public int foo(int a)
    {
        return ordinal() + a;
    }
}

interface IX {
    int foo(int a);
}
