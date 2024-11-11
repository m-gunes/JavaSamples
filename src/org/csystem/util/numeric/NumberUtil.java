/**
 * Utility class for numeric operations
 * Last Update: 3rd September 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.numeric;


public class NumberUtil {
    private NumberUtil()
    {
    }
    private static final String [] ONES_TR = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
    private static final String [] TENS_TR = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
    private static final String [] NUMBER_UNITS_TR = {"kentilyon", "katrilyon", "trilyon", "milyar", "milyon", "bin", ""};

    private static String numToStr3DigitsTR(int val)
    {
        StringBuilder sb = new StringBuilder();

        int a = val / 100; // yuzler basamagi
        int b = val / 10 % 10; // onlar basamagi
        int c = val % 10; // birler basamadi

        if (a != 0) {
            if(a != 1)
                sb.append(ONES_TR[a]).append(" ");
            sb.append("yüz ");
        }

        if (b != 0)
            sb.append(TENS_TR[b]).append(" ");

        if (c != 0)
            sb.append(ONES_TR[c]).append(" ");

        return sb.substring(0, sb.length() - 1);
    }

    public static int countDigits(long a)
    {
        return a != 0 ? (int) Math.log10(Math.abs(a)) + 1 : 1;
    }

    public static long factorial(int n)
    {
        long result = 1;

        for (long i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static int fibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, result = prev1 + prev2;

        for (int i = 3; i < n; ++i) {
            prev2 = prev1;
            prev1 = result;
            result = prev1 + prev2;
        }

        return result;
    }

    public static int [] getDigits(long a)
    {
        int [] digits = new int[countDigits(a)];
        a = Math.abs(a);

        for (int i = digits.length - 1; a != 0; digits[i--] = (int) (a % 10), a /= 10)
            ;

        return digits;
    }
    public static int [] getDigits2(long a)
    {
        int [] digits = new int[countDigits(a)];
        int i = digits.length - 1;
        a = Math.abs(a);
        while (a != 0) {
            digits[i] = (int) (a % 10);
            a /= 10;
            --i;
        }
        return digits;
    }

    public static int [] getDigitsInThrees(long a)
    {
        a = Math.abs(a);
        int [] threes = new int[a == 0 ? 1 : (int) (Math.log10(a) / 3) + 1]; // Check the operator precedence table.

        for (int i = threes.length - 1; a != 0; threes[i--] = (int) (a % 1000), a /= 1000)
            ;

        return threes;
    }

    public static int getDigitsPowSum(int a)
    {
        int result = 0;
        int n = countDigits(a);

        while (a != 0) {
            result += (int)Math.pow(a % 10, n);
            a /= 10;
        }

        return result;
    }

    public static boolean isArmstrong(int a)
    {
        return a >= 0 && getDigitsPowSum(a) == a;
    }

    public static boolean isEven(int a)
    {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a)
    {
        return !isEven(a);
    }

    public static boolean isPrime(long a)
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        if (a % 3 == 0)
            return a == 3;

        if (a % 5 == 0)
            return a == 5;

        if (a % 7 == 0)
            return a == 7;

        for (long i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

    public static long nextClosestPrime(long a)
    {
        if (a < 2)
            return 2;

        while (!isPrime(++a))
            ;

        return a;
    }

    public static int nextFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, next = prev1 + prev2;

        while (next <= val) {
            prev2 = prev1;
            prev1 = next;
            next = prev1 + prev2;
        }

        return next;
    }

    public static long nthPrime(int n)
    {
        long result = 2;
        int count = 0;

        for (long i = 2; count < n; ++i)
            if (isPrime(i)) {
                ++count;
                result = i;
            }
        return result;
    }

    public static String numToStrTR(long a)
    {
        if (a == 0)
            return "Sifir";

        int [] threes = getDigitsInThrees(a);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < threes.length; ++i)
            sb.append(numToStr3DigitsTR(threes[i])).append(" ").append(NUMBER_UNITS_TR[(NUMBER_UNITS_TR.length - threes.length) + i]).append(" ");

        return sb.substring(0, sb.length() - 1);
    }

    public static int reverse(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }

    public static int sumDigits(int val)
    {
        int total = 0;

        while (val != 0) {
            total += val % 10;
            val /= 10;
        }

        return Math.abs(total);
    }
}
