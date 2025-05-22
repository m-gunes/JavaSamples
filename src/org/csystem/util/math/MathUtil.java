package org.csystem.util.math;

public final class MathUtil {

    private MathUtil()
    {
    }

    public static double log(double a, double b)
    {
        return Math.log(b) / Math.log(a);
    }
}
