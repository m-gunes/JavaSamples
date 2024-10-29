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
    public static void run()
    {

        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = kb.nextLine();

        System.out.println("Print all palindrome--------->:");
        getAllPalindrome(s);
        System.out.println("---------<");

        System.out.printf("First palindrome: %s%n", getFirstPalindrome(s));
        System.out.printf("Last palindrome: %s%n", getLastPalindrome(s));
        System.out.printf("First longest palindrome: %s%n", getFirstLongestPalindrome(s));
        System.out.printf("First shortest palindrome: %s%n", getFirstShortestPalindrome(s));
        System.out.printf("Last longest palindrome: %s%n", getLastLongestPalindrome(s));
        System.out.printf("Last shortest palindrome: %s%n", getLastShortestPalindrome(s));
    }

    public static void getAllPalindrome(String s)
    {
        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue; // System.out.println(s.charAt(i));

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
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(i,k+1)))
                    if(s.substring(i, k+1).length() > str.length())
                        str = s.substring(i, k+1);
        }
        return str;
    }

    public static String getFirstShortestPalindrome(String s)
    {
        int minPalindromeLen = 2;
        String str = "";
        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = s.length() - 1; k > i; --k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(i,k+1))) {
                    String palindrome = s.substring(i, k+1);
                    if(palindrome.length() == minPalindromeLen)
                        return palindrome;
                    else if(str.isEmpty())
                        str = palindrome;
                    else if(palindrome.length() < str.length())
                            str = palindrome;
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
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(k,i+1))) {
                    String palindrome = s.substring(k, i+1);
                    if(palindrome.length() > str.length())
                        str = palindrome;
                }
        }
        return str;
    }

    public static String getLastShortestPalindrome(String s)
    {
        String str = "";
        int minPalindromeLen = 2;

        for (int i = s.length() - 1; i > 0; --i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = 0; k < i; ++k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(k,i+1))) {
                    String palindrome = s.substring(k, i+1);
                    if(palindrome.length() == minPalindromeLen)
                        return palindrome;
                    else if(str.isEmpty())
                        str = palindrome;
                    else if(palindrome.length() < str.length())
                        str = palindrome;
                }
        }
        return str;
    }

    public static String getFirstPalindrome(String s)
    {
        for (int i = 0; i < s.length(); ++i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = s.length() - 1; k > i; --k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(i,k+1)))
                    return s.substring(i, k+1);
        }
        return "";
    }

    public static String getLastPalindrome(String s)
    {
        for (int i = s.length() - 1; i > 0; --i) {
            if(!Character.isLetter(s.charAt(i)))
                continue;

            for (int k = 0; k < i; ++k)
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(k)) && StringUtil.isPalindrome(s.substring(k,i+1)))
                    return s.substring(k, i+1);
        }
        return "";
    }

    public static void main(String[] args)
    {
        run();
    }
}
