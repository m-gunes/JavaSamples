package org.csystem.subject.generics.examples;

public class App2 {
    public static void main(String[] args)
    {
        AA<Integer, String> ais = new AA<>();
        AA<Boolean, String> abs = new AA<>();

        Sample.doWork(ais); // upcasting
        Sample.doWork(abs); // upcasting
    }
}

class Sample {
    public static void doWork(X x)
    {
        //..
    }
}

class AA<T, K> extends X {
    public K foo(T t)
    {
        return null;
    }
}

class X {

}
