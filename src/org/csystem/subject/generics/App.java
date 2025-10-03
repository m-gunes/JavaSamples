package org.csystem.subject.generics;

import org.csystem.math.geometry.Point;
import org.csystem.util.console.Console;

public class App {
    public static void main(String[] args)
    {
        // instantiation
        A<String, String> as = new A<String, String>("Mustafa", "Gunes");
        A<Integer, String> ai = new A<>(1, "Veronica");
        B<Double> bd = new B<Double>(3.4);
        Console.writeLine("%s %s", as.getK(), as.getT());
        Console.writeLine("%d %s", ai.getT(), ai.getK());
        Console.writeLine("%f", bd.getT());

        // raw use
        A asr;
        B bsr;
    }
}


class A<T, K> {
    private T m_t;
    private K m_k;

    public A(T t, K k)
    {
        m_t = t;
        m_k = k;
    }

    public T getT()
    {
        return m_t;
    }

    public void setT(T t)
    {
        m_t = t;
    }

    public K getK()
    {
        return m_k;
    }

    public void setK(K k)
    {
        m_k = k;
    }
}

class B<T> {
    private final T m_t;

    public B(T t)
    {
        m_t = t;
    }

    public T getT()
    {
        return m_t;
    }
}
