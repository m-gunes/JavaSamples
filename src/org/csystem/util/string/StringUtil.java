/**
 * Utility class for string operations
 * Last Update: 8th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.string;

import java.util.Random;

public class StringUtil {

    public static String capitalize(String s)
    {
        return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s)
    {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            sb.setCharAt(i, Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }

        return sb.toString();
    }


    public static int countString(String s1, String s2)
    {
        int count = 0;

        for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)
            ;

        return count;
    }


    public static String generateRandomText(Random r, int count, String sourceText)
    {
        char [] c = new char[count];

        for(int i = 0; i < count; ++i)
            c[i] = sourceText.charAt(r.nextInt(sourceText.length()));

        return String.valueOf(c);
    }
    public static String generateRandomTextEN(Random r, int count)
    {
        return generateRandomText(r, count, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    }
    public static String generateRandomTextTR(Random r, int count)
    {
        return generateRandomText(r, count, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String [] generateRandomTexts(Random r, int count, int origin, int bound, String sourceText)
    {
        String [] s = new String[count];
        for(int i = 0; i < count; ++i)
            s[i] = generateRandomText(r, r.nextInt(origin, bound), sourceText);

        return s;
    }
    public static String [] generateRandomTextsEN(Random r, int count, int origin, int bound)
    {
        return generateRandomTexts(r, count, origin, bound, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    }
    public static String [] generateRandomTextsTR(Random r, int count, int origin, int bound)
    {
        return generateRandomTexts(r, count, origin, bound, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
    }


    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);

            if (!Character.isLetter(cLeft)) {
                ++left;
                continue;
            }

            char cRight = s.charAt(right);

            if (!Character.isLetter(cRight)) {
                --right;
                continue;
            }

            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))
                return false;

            ++left;
            --right;
        }

        return true;
    }


    public static boolean isPangram(String s, String alphabet)
    {
        for (int i = 0; i < alphabet.length(); ++i)
            if (s.indexOf(alphabet.charAt(i)) == -1)
                return false;

        return true;
    }


    public static boolean isPangramEN(String s)
    {
        s = s.toLowerCase();

        for (char c = 'a'; c <= 'z'; ++c)
            if (s.indexOf(c) == -1)
                return false;

        return true;
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String join(String [] s, String delimiter)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length; ++i)
            sb.append(s[i]).append(delimiter); // sb.append(s[i] + delimiter)  her seferinde yeni bir String nesnesi yaratır

        return sb.substring(0, sb.length() - delimiter.length());
    }

    public static String join(String [] s, char delimiter)
    {
        return join(s, String.valueOf(delimiter));
    }

    public static String padLeading(String s, int n, char ch)
    {
        int len = s.length();

        return len < n ? String.valueOf(ch).repeat(n - len) + s : s;
    }

    public static String padLeading(String s, int n)
    {
        return padLeading(s, n, ' ');
    }

    public static String padTrailing(String s, int n, char ch)
    {
        int len = s.length();

        return len < n ? s + String.valueOf(ch).repeat(n - len) : s;
    }

    public static String padTrailing(String s, int n)
    {
        return padTrailing(s, n, ' ');
    }

    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

    public static char [] reverseToCharArr(String s)
    {
        // StringBuilder da iceride char turden dizi kullaniyor. Etkinlik olarak yukaridaki reverse metodu ile ayni fakat o daha kisa.
        char [] c = s.toCharArray();
        for(int i = 0; i < c.length / 2; ++i) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return c;
    }
}