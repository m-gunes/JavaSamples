package org.csystem.subject.generics.examples;

public class App3 {
}

class BB implements IA<Boolean, String> {
    public String foo(Boolean a)
    {
        return String.valueOf(a);
    }
}

class CC implements IA<String, Integer> {
    public Integer foo(String str)
    {
        return str.length();
    }
}

//class DD implements IA<Integer, Boolean>, IA<String, String> { // Error
//    public Boolean foo(Integer i)
//    {
//        return i != 0;
//    }
//    public String foo(String s)
//    {
//        return s.toUpperCase();
//    }
//}

//class E implements IA<Integer, Boolean>, IB<String, String> { // Error
//    public Boolean foo(Integer i)
//    {
//        return i != 0;
//    }
//    public String foo(String s)
//    {
//        return s.toUpperCase();
//    }
//}

class F implements IA<Integer, Boolean>, IC<String, String> {
    public Boolean foo(Integer i)
    {
        return i != 0;
    }
    public String bar(String s)
    {
        return s.toUpperCase();
    }
}

interface IC<T, K> {
    K bar(T t);
}

interface IB<T, K> {
    K foo(T t);
}

interface IA<T, K> {
    K foo(T t);
}

