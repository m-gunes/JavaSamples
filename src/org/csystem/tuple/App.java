package org.csystem.tuple;

public class App {
}

class Sample<T, K> {
    private T m_t;
    private K [] m_ks;

    public Sample(int size)
    {
        // m_t = new T(); //error
        // m_ks = new T[size];  //error

    }

    //...
}


class Sample2<T, K> {
    private T m_t;
    private K [] m_ks;

    public Sample2(int size)
    {
        m_t = (T)new Object();
        m_ks = (K[]) new Object[size];
    }

    //...
}