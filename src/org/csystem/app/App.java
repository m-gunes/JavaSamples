package org.csystem.app;


class App {
    public static void main(String[] args)
    {
    }
}


//class A implements IX { // error
//}

abstract class B implements IX {

}

abstract class C implements IX, IY {
    public void foo()
    {
    }

    public void bar()
    {
    }
}

interface IX {
    void foo();
}

interface IY {
    void bar();
    void tar();
}