package org.csystem.app;


class App {
    public static void main(String[] args)
    {
    }
}

interface Ix {
    int A = 10;
    void foo();
    default void bar(int a)
    {
    }

    static void tar(int a, double b)
    {
    }

    private void car()
    {
    }

    private static void zar()
    {
    }
}