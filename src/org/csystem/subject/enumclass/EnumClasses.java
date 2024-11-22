package org.csystem.subject.enumclass;

import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

/**
 enum sınıfları enum anahtar sözcüğü ile bildirilirler.
 <p>Bir enum class içerisinde aralarına virgül konularak bildirilen isimlere enum sabitleri (enum constants) denilmektedir.
 <p>enum sabitlerinin her biri public, static ve final olarak bildirilmiş ait olduğu enum class türünden referans değişkenlerdir
 <p>ve bu değişkenler yaratıldıklarında her biri ait oldukları enum class türünden bir nesneyi gösterir duruma gelirler.
 <p>enum sabitleri için public, static, final ve tür ismi yaratılması geçersizdir.
 <p>Son enum sabitinden sonra noktalı virgül konabilir.
 <p>Eğer enum class içerisinde yalnızca enum sabitleri olacaksa bu durumda noktalı virgül konmasına gerek yoktur.
 <p>Enum sınıfına sabit dışında elemanlar eklenecekse noktalı virgül gereklidir.
 */

public class EnumClasses {
    public static void main(String[] args)
    {
        DemoGameApp.run(args);
    }
}

class DemoGameApp {
    public static void run(String [] args)
    {
        Direction [] directions = Direction.values();

        Random random = new Random();
        GameObject go1 = new GameObject("Player-1");
        GameObject go2 = new GameObject("Player-2");

        go1.setColor(Colour.RED);
        go2.setColor(Colour.BLUE);

        while (true) {
            int index1 = random.nextInt(0, 4);
            int index2 = random.nextInt(0, 4);

            go1.move(directions[index1]);
            go2.move(directions[index2]);

            ThreadUtil.sleep(random.nextLong(300, 900));
        }
    }
}

/**
 sadece bunu yazdigimizda public static final Direction RIGHT, TOP, LEFT, BOTTOM turunden referans veri elemanlari yaratiliyor
 ordinal diye bir methodu var
 values diye static bir metodu var. Hatta toString felan var..
*/
enum Direction {
    RIGHT, TOP, LEFT, BOTTOM
}
enum Color {
    RED, GREEN, BLUE, WHITE, BLACK
}

class GameObject {
    private final String m_name;
    private Colour m_color;

    public GameObject(String name)
    {
        m_name = name;
    }

    /**
     * enum sabitleri sabit ifadesi (constant expression) olarak ele alınır.
     * Dolayısıyla enum sınıfları ve sabitleri switch statement ve switch expression ile de kullanılabilir.
     */
    public void move(Direction direction)
    {
        switch (direction) {
            case RIGHT -> System.out.printf("%s moves to right%n", m_name);
            case TOP -> System.out.printf("%s moves to top%n", m_name);
            case LEFT -> System.out.printf("%s moves to left%n", m_name);
            case BOTTOM -> System.out.printf("%s moves to bottom%n", m_name);
            default -> System.out.println("Invalid direction value");
        }
    }

    public void setColor(Colour color)
    {
        m_color = color;
    }

    public Colour getColor()
    {
        return m_color;
    }

}

/*
class Direction {
    private final int m_ordinal;

    private Direction(int ordinal)
    {
        m_ordinal = ordinal;
    }

    private static final Direction [] m_values = {new Direction(0), new Direction(1), new Direction(2), new Direction(3)};

    public static final Direction RIGHT = m_values[0];
    public static final Direction TOP = m_values[1];
    public static final Direction LEFT = m_values[2];
    public static final Direction BOTTOM = m_values[3];

    public static Direction [] values()
    {
        return Arrays.copyOf(m_values, m_values.length);
    }

    public int ordinal()
    {
        return m_ordinal;
    }

}
*/

/*
class Color {
    private final int m_ordinal;

    private Color(int value)
    {
        m_ordinal = value;
    }

    public static final Color RED = new Color(0);
    public static final Color GREEN =  new Color(0);
    public static final Color BLUE =  new Color(0);
    public static final Color WHITE = new Color(0);
    public static final Color BLACK = new Color(0);

    public int getOrdinal()
    {
        return m_ordinal;
    }
}
*/
