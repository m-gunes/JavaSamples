package org.csystem.generator.random.string;

import org.csystem.util.string.StringUtil;

import java.util.Arrays;
import java.util.Random;

public class RandomStringArrayGeneratorTR {
    private final String [] m_texts; // bu referansin final yapmasi dizinin elemanlarinin degistirilemeyecegi anlamina gelmiyor, adresi disari verdigi surece.

    public RandomStringArrayGeneratorTR(Random random, int count, int origin, int bound)
    {
        m_texts = StringUtil.generateRandomTextsTR(random, count, origin, bound);
    }

    public String [] getTexts() // adresi disari verdigi surece dizinin nesnesinin elemanlarinin degisimi engellenemez. Cunku diziler immutable degildir!!!
    {
        // return m_texts;
        return Arrays.copyOf(m_texts, m_texts.length); // Artık içsel olarak tutulan dizinin doğrudan adresi değil, kopyasının (yeni yaratılmış olan bir dizinin) adresi dışarıya verilmektedir.
        // Arrays.copyOf() metodu her çağrıldığında yeni bir dizi oluşturur, yani her çağrıda farklı bir referans elde edersiniz.
    }




}
