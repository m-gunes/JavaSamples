package org.csystem.app.exam;

import org.csystem.util.array.ArrayUtil;

public class SectionHelper {
    public static void printSection(Section section, int sectionNumber)
    {
        double averageOfNotes = section.getPhysicsGPA();

        System.out.printf("%d Şube Fizik sınavı bilgileri %n", sectionNumber);

        System.out.println();

        System.out.printf("Şube'nin öğrenci sayısı: %d%n", section.numberOfStudents);

        System.out.println();

        System.out.println("Şube not tablosu:");
        ArrayUtil.print(section.notes);

        System.out.println();

        System.out.printf("Şube'nin Fizik dersi ortalaması: %.1f%n", averageOfNotes);

        System.out.println();

        System.out.println("Sube'nin not dağılımına ilişkin histogramı:");
        ArrayUtil.print(section.getNotesHistogramData());

        System.out.println("--------------------------------------");

    }
}