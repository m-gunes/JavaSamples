package org.csystem.subject.generics;

import org.csystem.util.console.Console;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args)
    {
        ArrayListEx.runInteger();
    }
}

class ArrayListEx {
    public static void runString()
    {
        ArrayList<String> texts = new ArrayList<>();

        while (true) {
            String s = Console.readString("Input a text:");

            if ("quit".equals(s))
                break;
            texts.add(s);
        }

        for (String s : texts)
            Console.writeLine(s);
    }

    public static void runInteger()
    {
       ArrayList<Integer> numbers = new ArrayList<>();

       while (true) {
           int val = Console.readInt("Input a number:", "Invalid value!");
           if (val == 0)
               break;

           numbers.add(val); // auto-boxing: Integer.valueOf(val)
       }

       int sum = 0;
       for (int val : numbers)
           sum += val; // unboxing

        Console.writeLine("Sum: %d", sum);

    }

}