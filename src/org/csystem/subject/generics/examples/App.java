package org.csystem.subject.generics.examples;

public class App {
}




class B extends A<Integer, String> {
    public String foo(Integer a)
    {
        return String.valueOf(a);
    }
}

class C extends A<Boolean, Integer> {
   public Integer foo(Boolean b)
   {
       return b ? 1 : 0;
   }
}

abstract class A<T, K> {
    public abstract K foo(T t);
}