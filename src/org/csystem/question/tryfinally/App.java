package org.csystem.question.tryfinally;
import org.csystem.util.console.Console;

/**
 Soru: Aşağıdaki programın ekran çıktısını yazınız
 */
class App {
    public static void main(String[] args)
    {
        Console.writeLine(Sample.doWork("foo"));
        Console.writeLine(Sample2.doWork("foo"));
    }
}

class Sample {
    public static StringBuilder doWork(String s)
    {
        StringBuilder sb = new StringBuilder(s);

        try {
            return sb.append("return");
        }
        finally {
            sb.append("finally");
        }
    }
}

class Sample2 {
    public static String doWork(String s)
    {
        StringBuilder sb = new StringBuilder(s);

        try {
            return sb.append("return").toString();
        }
        finally {
            sb.append("finally");
        }
    }
}
