package org.csystem.subject.enumclass;

import java.util.Random;
import java.util.Scanner;

public class EnumClasses_2 {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a number:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            Colour colour = Colour.randomColor(random);
            System.out.printf("%s[r = %d, g = %d, b = %d]%n", colour.toString(), colour.r, colour.g, colour.b);
           /*
                enum sabitlerinin her biri public, static ve final olarak bildirilmiş ait olduğu enum class türünden referans değişkenlerdir
                ve bu değişkenler yaratıldıklarında her biri ait oldukları enum class türünden bir nesneyi gösterir duruma gelirler.
            */
        }
    }
}

// Bir enum sınıfına ctor eklenmesi mantıksal olarak nesneye bir ya da birden fazla değerin iliştirilmesi (attachment) için kullanılır.
enum Colour {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), WHITE(255, 255, 255), BLACK;
    private static final Colour[] VALUES = values();
    public final int r, g, b;

    Colour() // bu ctor BLACK icin. BLACK(0, 0, 0) seklinde de yazabilirdik
    {
        r = g = b = 0;
    }

    Colour(int x, int y, int z)
    {
        r = x;
        g = y;
        b = z;
    }

    public static Colour randomColor(Random random)
    {
        return VALUES[random.nextInt(VALUES.length)];
    }

}
