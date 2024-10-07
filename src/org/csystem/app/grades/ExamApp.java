package org.csystem.app.grades;

import java.util.Random;
import java.util.Scanner;

public class ExamApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Şube sayısını giriniz:");
        int numberOfSection = Integer.parseInt(kb.nextLine());
        Section [] school = new Section[numberOfSection];

        for(int i = 0; i < numberOfSection; ++i) {
            System.out.printf("%d. şube için öğrenci sayısını giriniz:", i+1);
            int numberOfStudent = Integer.parseInt(kb.nextLine());
            Section section = new Section(r, numberOfStudent);
            school[i] = section;
        }
        System.out.println();

        double totalPhysicsGPA= 0.0;

        for(int i = 0; i < school.length; ++i) {
            SectionHelper.printSection(school[i], i+1);
            totalPhysicsGPA += school[i].getPhysicsGPA();
        }

        System.out.printf("Okulun Fizik dersi ortalaması: %.1f%n", totalPhysicsGPA / numberOfSection );

    }

    public static void main(String[] args)
    {
        run();
    }
}
