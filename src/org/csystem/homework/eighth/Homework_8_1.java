package org.csystem.homework.eighth;

import java.util.Scanner;

// bu ornek {aslinda {hic zor}} degil
// Bu ornekten {daha {zor {ornekler de yapacagiz} degil}} mi?
// Yanlis {bir giris icin hata mesaji yazdirilacak

public class Homework_8_1 {
    private static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir yazı giriniz:");
        String s = kb.nextLine();
        extract(s, '{', '}');
    }

    public static void extract(String s, char beginChar, char endChar)
    {
        int beginIdx = s.lastIndexOf(beginChar);
        int endIdx = s.indexOf(endChar);
        System.out.println(endIdx == -1 || beginIdx == -1 ? "Yanlış bir giriş" : s.substring(beginIdx+1, endIdx));
    }

    public static void main(String [] args)
    {
        run();
    }
}
