package org.csystem.subject;

public class Final {
    public static void main(String[] args)
    {
        final int a = 10;
        final int b;
        b = 20;
        // ++b; // Error
        // a += 3; // Error

        final Sample s = new Sample(20);
        s.c = 10;
    }
}


class Sample {
    // public final int a; // Error
    // public static final int b; // Error
    public final int a = 10;
    public final int b;
    public static final int VISIBLE = 1;

    public int c;

    public Sample()
    {
        b = 0;
    }

    public Sample(int x)
    {
        c = x;
        b = x;
    }

    public static void foo(int a, final double b)
    {
        ++a;
        // --b; // Error
    }
}