package org.csystem.subject.var;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        ex2();
    }
    public static void ex1()
    {
        var a = 10;
        var b = 3.4;
        var c = "Ankara";
        var e = 3.4f;
        // e = 3.4; // error

        double f = 3; //implicit conversion. int'in double convert edilmesidir.

        // var g; // bildirim noktasinda ilk deger verilmeli. initialization! ilk kez deger vermenizi beklemiyor.
        // initialization(ilk deger verme) ile ilk kez deger verme ayni sey degil.
        // g = 30;

        ++a;
        --b;
        // ++c; // error

        // var aa = 10, bb = 20; // error
    }
    public static void ex2()
    {
        var random = new Random();
        var n = Console.readInt("Input count:");

        for (var i = 0; i < n; ++i)
            Console.write("%d ", random.nextInt(1, 100));

        Console.writeLine();
    }
    public static void ex3()
    {
        var random = new Random();
        var n = Console.readInt("Input count:");
        var a = ArrayUtil.generateRandomArray(random, n, 1, 100);

        for (var val : a)
            Console.write("%d ", val);

        Console.writeLine();
    }
}
