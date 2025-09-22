package org.csystem.subject.interfaces.casting;

public class InterfaceToInterface {
    public static void main(String[] args)
    {
        V v = new V();
        IG ig = v;
        IM im;
        im = ig; // upcasting

        AAAA a = new AAAA();
        IYYYi iy = a;
        IXXXi ix;
        ix = (IXXXi) iy; // valid casting

        BBB b = new BBB();
        IB iB = b;
        IA iA;
        iA = (IA) iB; // invalid casting
    }
}

class V implements IG {}
interface IG extends IM {}
interface IM {}

class AAAA implements IXXXi, IYYYi {}
interface IYYYi {}
interface IXXXi {}

class BBB implements IB {}
interface IB {}
interface IA {}

