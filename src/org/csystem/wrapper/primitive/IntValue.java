package org.csystem.wrapper.primitive;

public class IntValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final int INDEX_DIFFERENCE = 128;
    private final int m_value;
    private static final IntValue [] CACHE = new IntValue[CACHE_MAX - CACHE_MIN + 1];

    private IntValue(int value)
    {
        m_value = value;
    }

    // kutuluyoruz. boxing
    public static IntValue of(int value)
    {
        if (value < CACHE_MIN || value > CACHE_MAX)
            return new IntValue(value);

        if (CACHE[value + INDEX_DIFFERENCE] == null)
            CACHE[value + INDEX_DIFFERENCE] = new IntValue(value);

        return CACHE[value + INDEX_DIFFERENCE];
    }

    // kutuyu aciyoruz. unboxing
    public int getValue()
    {
        return m_value;
    }

    public String toString()
    {
        return String.valueOf(m_value);
    }

}
