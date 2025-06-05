package org.csystem.subject.wrapper;

public class App {
    public static void main(String[] args) {
        System.out.printf("short -> %d/%d bytes/bits%n", Short.BYTES, Short.SIZE);
        System.out.printf("int -> %d/%d bytes/bits%n", Integer.BYTES, Integer.SIZE);
        System.out.printf("long -> %d/%d bytes/bits%n", Long.BYTES, Long.SIZE);
        System.out.printf("byte -> %d/%d bytes/bits%n", Byte.BYTES, Byte.SIZE);
        System.out.printf("float -> %d/%d bytes/bits%n", Float.BYTES, Float.SIZE);
        System.out.printf("double -> %d/%d bytes/bits%n", Double.BYTES, Double.SIZE);
        System.out.printf("char -> %d/%d bytes/bits%n", Character.BYTES, Character.SIZE);

        System.out.println("-----------------------------------------------------------");

        System.out.printf("short -> [%d, %d]%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int -> [%d, %d]%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long -> [%d, %d]%n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("byte -> [%d, %d]%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println("float -> [+-" + Float.MIN_VALUE + ", +-" + Float.MAX_VALUE + "]");
        System.out.println("double -> [+-" + Double.MIN_VALUE + ", +-" + Double.MAX_VALUE + "]");
        System.out.printf("char -> [%d, %d]%n", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

        System.out.println("-----------------------------------------------------------");

        Integer iVal1 = Integer.valueOf(127); // boxing
        Integer iVal2 = Integer.valueOf(127);
        Integer iVal3 = Integer.valueOf(128);
        Integer iVal4 = Integer.valueOf(128);
        System.out.println(iVal1 == iVal2 ? "Same object/reference" : "Different object" );
        System.out.println(iVal3 == iVal4 ? "Same object/reference" : "Different object" );

        int val = iVal1.intValue(); // unboxing
        System.out.println(val);

        System.out.println("-----------------------------------------------------------");

        Character c1 = Character.valueOf('D');
        Character c2 = Character.valueOf('D');
        Character c3 = Character.valueOf('Ş');
        Character c4 = Character.valueOf('Ş');
        System.out.println(c1 == c2 ? "Same object/reference" : "Different object" );
        System.out.println(c3 == c4 ? "Same object/reference" : "Different object" );

        char ch = c1.charValue();
        System.out.println(ch);

        System.out.println("-----------------------------------------------------------");

        Integer val1 = 127; // auto-boxing: Integer.valueOf(127);
        Integer val2 = 127; // auto-boxing: Integer.valueOf(127);
        Integer val3 = 128; // auto-boxing: Integer.valueOf(128);
        Integer val4 = 128; // auto-boxing: Integer.valueOf(128);
        System.out.println(val1 == val2 ? "Still Same object/reference" : "Different object" );
        System.out.println(val3 == val4 ? "Same object/reference" : "Different object" );

        System.out.println("-----------------------------------------------------------");
        int a = val1; // auto-unboxing: val1.intValue();
        System.out.printf("a = %d%n", a);

        System.out.println("-----------------------------------------------------------");

        Object o = 127; // auto-boxing: Integer.valueOf(127)
        int b = (int) o; // auto-unboxing: (int)o ifadesinin karşılığı -> ((Integer)o).intValue()
        System.out.printf("b = %d%n", b);

    }
}
