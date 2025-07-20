package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.*;

class App {
    public static void main(String[] args)
    {
        Vector texts = new Vector(5);
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

        texts.ensureCapacity(7);
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

        texts.ensureCapacity(23);
        System.out.printf("Size:%d%n Capasity:%d%n", texts.size(), texts.capacity());

    }
}