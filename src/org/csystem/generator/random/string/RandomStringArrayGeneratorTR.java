package org.csystem.generator.random.string;

import org.csystem.util.string.StringUtil;

import java.util.Random;

// Another way to make a class immutable:
public class RandomStringArrayGeneratorTR {
    private final String [] m_texts;

    public RandomStringArrayGeneratorTR(Random random, int count, int origin, int bound)
    {
        m_texts = StringUtil.generateRandomTextsTR(random, count, origin, bound);
    }

    public int size()
    {
        return m_texts.length;
    }

    public String get(int i)
    {
        return m_texts[i];
    }
}
