package org.csystem.string;

import java.util.Arrays;

public class CSDStringBuilder {

    private static final int DEFAULT_CAPACITY_IF_CURRENT_ZERO = 1;
    private static final int CAPACITY_INCREMENT_FACTOR = 2;
    private static final int DEFAULT_CAPACITY = 16;
    private char [] m_chars;
    private int m_index;

    private boolean checkCapacity(String str)
    {
        return m_index + str.length() <= m_chars.length;
    }

    private int calculateNewCapacity(char [] str)
    {
       int result = m_chars.length == 0 ? DEFAULT_CAPACITY_IF_CURRENT_ZERO : m_chars.length;
       while ((result = result * CAPACITY_INCREMENT_FACTOR) < m_index + str.length)
           ;

       return result;
    }

    private void enLargeCapacity(int newCapacity)
    {
        m_chars = Arrays.copyOf(m_chars, newCapacity);
    }

    public CSDStringBuilder()
    {
        this(DEFAULT_CAPACITY);
    }

    public CSDStringBuilder(int capacity)
    {
        m_chars = new char[capacity];
    }

    public CSDStringBuilder(String str)
    {
        m_chars = str.toCharArray(); // icsel olarak tuttugu dizinin adresini vermiyor, dizinin bir kopyasini cikariyor. (bu sebeple immutable)
        m_index += str.length();
    }

    public CSDStringBuilder append(String str)
    {
        return append(str.toCharArray());
    }

    public CSDStringBuilder append(char ch)
    {
        return append(String.valueOf(ch));
    }

    public CSDStringBuilder append(int a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(long a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(double a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(char [] str)
    {
        if (!checkCapacity(String.valueOf(str)))
            enLargeCapacity(calculateNewCapacity(str));

        System.arraycopy(str, 0, m_chars, m_index, str.length);
        m_index += str.length;
        return this;
    }

    public int capacity()
    {
        return m_chars.length;
    }

    public char charAt(int index)
    {
        return m_chars[index];
    }

    public CSDStringBuilder deleteCharAt(int index)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder delete(int start, int end)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_chars.length)
            enLargeCapacity(Math.max(minCapacity, m_chars.length * CAPACITY_INCREMENT_FACTOR));
    }

    public int indexOf(String str)
    {
        return indexOf(str, 0); // Todo: Check
    }

    public int indexOf(String str, int fromIndex)
    {
        return String.valueOf(m_chars).indexOf(str, fromIndex); // Todo: Check
    }

    public CSDStringBuilder insert(int index, String str)
    {
        return insert(index, str.toCharArray());
    }

    public CSDStringBuilder insert(int index, char ch)
    {
        return insert(index, String.valueOf(ch));
    }

    public CSDStringBuilder insert(int index, int a)
    {
        return insert(index, String.valueOf(a));
    }

    public CSDStringBuilder insert(int index, long a)
    {
        return insert(index, String.valueOf(a));
    }

    public CSDStringBuilder insert(int index, double a)
    {
        return insert(index, String.valueOf(a));
    }

    public CSDStringBuilder insert(int index, char [] str) // Todo: Check
    {
        if (!checkCapacity(String.valueOf(str)))
            enLargeCapacity(calculateNewCapacity(str));

        char [] tempList = Arrays.copyOf(str, str.length + Math.abs(m_index - index));

        for (int i = 0 ; i < m_index - index ; ++i)
            tempList[str.length + i] = m_chars[index + i];

        System.arraycopy(tempList, 0, m_chars, index, tempList.length);
        m_index += str.length;

        return this;
    }

    public int length()
    {
        return m_index;
    }

    public void trimToSize()
    {
        enLargeCapacity(m_index);
    }

    public String toString()
    {
        return String.valueOf(m_chars, 0, m_index);
    }

}
