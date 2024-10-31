package org.csystem.homework.eighth;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

/*
Palindrome ornekleri:

Ey Edip Adana'da pide ye
Anastas mum satsana
Ali Papila

asdfst ali papila Anastas mum satsana
asdfst Anastas mum satsana ali papila
Mustafa Ali papila nerede. Anastas mum satsana neden satmiyorsun. Ey Edip Adana'da pide ye tamam mi?
Mustafa Ali papila nerede. Ye Edip Adana'da pide ey kral. Ey Edip Adana'da pide ye. Anastas mum satsana neden satmiyorsun? Sat tamam mi?
Mustafa Ali papila nerede. ff. Ey Edip Adana'da pide ye. Ye Edip Adana'da pide ey, ll, Anastas mum satsana neden satmiyorsun? Sat tamam mi?
*/

public class Homework_8_6 {
    public static final int MIN_PALINDROME_LEN = 2;

    public static void run()
    {

        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = kb.nextLine();

        System.out.println("Print all palindrome--------->:");
        getAllPalindrome(s);
        System.out.println("---------<");

        System.out.printf("First longest palindrome: %s%n", getFirstLongestPalindrome(s));
        System.out.printf("First shortest palindrome: %s%n", getFirstShortestPalindrome(s));
        System.out.printf("Last longest palindrome: %s%n", getLastLongestPalindrome(s));
        System.out.printf("Last shortest palindrome: %s%n", getLastShortestPalindrome(s));
    }

    public static void getAllPalindrome(String s)
    {
        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = s.length() - 1; k > i; --k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(i,k+1))) {
                    System.out.println(s.substring(i,k+1)); // System.out.printf("i:%d, k:%d%n", i, k);
                    i = k;
                    break;
                }
        }
    }

    public static String getFirstLongestPalindrome(String s)
    {
        String str = "";

        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = s.length() - 1; k > i; --k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k))) {
                    String text = s.substring(i, k+1);
                    if(StringUtil.isPalindrome(text) && text.length() > str.length())
                        str = text;
                }
        }
        return str;
    }

    public static String getFirstShortestPalindrome(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = s.length() - 1; k > i; --k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k))) {
                    String text = s.substring(i, k+1);
                    if(StringUtil.isPalindrome(text))
                        if(text.length() == MIN_PALINDROME_LEN)
                            return text;
                        else if(str.isEmpty())
                            str = text;
                        else if(text.length() < str.length())
                                str = text;
                }
        }
        return str;
    }

    public static String getLastLongestPalindrome(String s)
    {
        String str = "";

        for (int i = s.length() - 1; i > 0; --i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = 0; k < i; ++k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k))) { // bu kontrol ile gereksiz substring metodu ile olusacak yeni String nesnesi yaratılmasını önlenmeye calisilmistir.
                    String text = s.substring(k, i+1);
                    if(StringUtil.isPalindrome(text) && text.length() > str.length())
                        str = text;
                }
        }
        return str;
    }

    public static String getLastShortestPalindrome(String s)
    {
        String str = "";

        for (int i = s.length() - 1; i > 0; --i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = 0; k < i; ++k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k))) {
                    String text = s.substring(k, i+1);
                    if(StringUtil.isPalindrome(text))
                        if(text.length() == MIN_PALINDROME_LEN)
                            return text;
                        else if(str.isEmpty())
                            str = text;
                        else if(text.length() < str.length())
                            str = text;
                }
        }
        return str;
    }

    public static void main(String[] args)
    {
        run();
    }
}
