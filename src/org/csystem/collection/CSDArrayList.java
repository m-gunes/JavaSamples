package org.csystem.collection;

/**
 * Sınıf Çalışması: İskeleti verilen CSDArrayList<E> sınıfını aşağıdaki açıklamalara göre yazınız:<p>
 * Açıklamalar: <p>
 * - Sınıfın metotları ArrayList<E> sınıfındaki metotların yaptığı işleri yapacaktır. <p>
 * - Metotların karmaşıklıklarının ArrayList<E> ile aynı olması gerekir. <p>
 * - Metotlarda fırlatılacak exception'lar yine ArrayList<E> ile aynı olacaktır. <p>
 * - Sınıfın public bölümünü değiştirmeden istediğiniz eklemeyi yapabilirsiniz. <p>
 * - CSDArrayList<E> sınıfının iskeleti şu şekildedir:
 */

public class CSDArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E [] m_elements;
    private int m_index;

    private void IllegalArgumentException(String message)
    {
        throw new IllegalArgumentException(message);
    }

    private void checkCapacity(int capacity)
    {
        if (capacity < 0)
            IllegalArgumentException(String.format("Capacity must be non-negative:%d", capacity));
    }

    public CSDArrayList()
    {
        m_elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_elements = (E[]) new Object[initialCapacity];
    }

    public boolean add(E element)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void add(int index, E element)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int capacity()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void ensureCapacity(int minCapacity)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public E get(int index)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public E remove(int index)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public E set(int index, E element)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int size()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void trimToSize()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}