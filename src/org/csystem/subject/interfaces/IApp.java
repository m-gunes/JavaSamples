package org.csystem.subject.interfaces;

public class IApp {
    public static void main(String[] args)
    {
        Bb b = new Bb();
        Cc c = new Cc();

        Sample.foo(b);
        Sample.foo(c);
    }
}


class Sample {
    public static void foo(Ixx ix)
    {

    }
}

class Cc extends Aa  {

}

class Bb extends Aa implements Iyy {

}

class Aa implements Izz {
    public void tar(float a)
    {

    }

    public void foo(int a)
    {

    }

    public void bar(int a)
    {}

}

interface Izz extends Iyy, Ixx {
    void tar(float a);
}

interface Iyy {
    void foo(int a);
}

interface Ixx {
    void bar(int a);
}
