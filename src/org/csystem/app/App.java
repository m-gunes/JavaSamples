package org.csystem.app;


import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.random.RandomGenerator;

class App {
    public static void main(String[] args)
    {
        RandomGenerator randomGenerator = RandomGenerator.of("Random"); // Bu bizim kullandigimiz Random algoritmasiyla ayni
        Console.writeLine(randomGenerator.isDeprecated());
        Console.writeLine(StringUtil.generateRandomTextTR(randomGenerator, 10));
    }
}
