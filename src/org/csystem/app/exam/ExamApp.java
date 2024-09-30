package org.csystem.app.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Sube sayisini giriniz:");
        int numberOfSection = Integer.parseInt(kb.nextLine());
        Section [] sections = new Section[numberOfSection];

        int i = 0;
        while (i < numberOfSection) {
            System.out.printf("%d. sube icin ogrenci sayisini giriniz:", i+1);
            int numberOfStudent = Integer.parseInt(kb.nextLine());
            Section section = new Section(r, (char) ('A' + i), numberOfStudent);
            sections[i] = section;
            ++i;
        }

        System.out.println();

        for(Section section : sections)
            SectionHelper.printSection(section);
    }

    public static void main(String[] args)
    {
        run();
    }
}
