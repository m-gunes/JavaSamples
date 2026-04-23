package org.csystem.subject.generics;

public class ConstraintGenerics {
}

// T turu AutoCloseble'i implemente eden bir tur olsun
// K turu Runnable'i implemente eden bir tur olsun
// extends anahtar sozcugu ile bir sınıf ya da bir metodun generic tür parametresi için bir kısıt (constraint) verilebilir.
class Sample<T extends AutoCloseable, K extends Runnable> {
    public void foo(T t, K k)
    {
        try(t) {
            k.run();
        } catch (Exception ex) {
            //..
        }
    }
}

class MyRunable implements Runnable {
    @Override
    public void run()
    {
        //..
    }
}
