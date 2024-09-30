package org.csystem.app.exam;

import org.csystem.util.array.ArrayUtil;

public class SectionHelper {
    public static void printSection(Section section)
    {
        section.createNotes();
        double averageOfNotes = section.getPhysicsClassAverage();

        System.out.printf("%c Subesi Fizik sinavi bilgileri: %n", section.name);

        System.out.println();

        System.out.printf("Subenin ogrenci sayisi: %d%n", section.numberOfStudents);

        System.out.println();

        System.out.println("Sube not tablosu:");
        ArrayUtil.print(section.notes);

        System.out.println();

        System.out.printf("Subenin Fizik dersi ortalaması: %.1f%n", averageOfNotes);

        System.out.println();

        System.out.println("Sube nin not dağılımına ilişkin histogramı:");
        ArrayUtil.print(section.getNotesHistogramData());

        System.out.println("--------------------------------------");

    }
}
