package org.csystem.subject.relations.inheritance.upcasting;

import org.csystem.wrapper.primitive.IntValue;

import java.util.Random;

/**
 * Object sınıfı her sınıfın doğrudan ya da dolaylı olarak taban sınıfı olduğuna göre her türden referans Object türden referansa doğrudan dönüşebilir/atanabilir.
 */
public class CastingToObject {
    public static void main(String[] args)
    {
        Object oSample = IntValue.of(68);
        Object oString = "Ankara";
        Object oRandom = new Random();

    }
}
