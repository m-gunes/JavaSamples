package org.csystem.homework.eighth;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

/*
Ey Edip Adana'da pide ye
Anastas mum satsana
Ali Papila

asdfst ali papila Anastas mum satsana
asdfst Anastas mum satsana ali papila

 */
public class Homework_8_6 {
    public static void run()
    {

        Scanner kb = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = kb.nextLine();
        int k = 0;
        for(int i = 0; i < s.length(); ++i) {
            k = s.lastIndexOf(s.charAt(i));
            String temp = s.substring(i, k+1);
            if(k > 0 && temp.length() > 2 && StringUtil.isPalindrome(temp)) {
                System.out.println(temp);
                i = k;
            }
        }

        System.out.println(getLastLongestPalindrome(s));
    }

    public static String getLastLongestPalindrome(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); ++i) {
            str = s.substring(i);
            if (str.length() > 1 && StringUtil.isPalindrome(str))
                return str;
        }

       return str;
    }


    public static void main(String[] args)
    {
        run();
    }
}
