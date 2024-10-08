package org.csystem.app.grades;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Şube sayısını giriniz:");

        int nClasses = Integer.parseInt(kb.nextLine());
        Exam Physics = new Exam("Fizik", nClasses);

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("%d. şube için öğrenci sayısını giriniz:", i+1);
            int numberOfStudent = Integer.parseInt(kb.nextLine());
            Physics.setNumberOfStudent(i, numberOfStudent);
        }

        Physics.generateGrades(r);
        Physics.setAverages();
        PrintExam(Physics);
    }

    public static void PrintExam(Exam exam)
    {
        int classesLen = exam.getNumberOfClasses();

        for (int i = 0; i < classesLen; ++i) {
            System.out.println("--------------------------------------");
            System.out.printf("%d. Şube'nin öğrenci sayısı: %d%n", i+1, exam.getNumberOfStudent(i));
            System.out.printf("Şube'nin %s dersi ortalaması: %.1f%n", exam.getLectureName(), exam.getAverage(i));

            System.out.println("Şube not tablosu:");
            ArrayUtil.print(exam.getGrade(i));

            System.out.println("Sube'nin not dağılımına ilişkin histogramı:");
            ArrayUtil.print(exam.getGradeHistogramData(i));
        }

        System.out.println("--------------------------------------");
        System.out.printf("Okulun Fizik dersi ortalaması: %.1f%n", exam.getSchoolAverage());
        System.out.println("Okulun not dağılımına ilişkin histogramı:");
        ArrayUtil.print(exam.getSchoolHistogramData());
    }

    public static void main(String[] args)
    {
        run();
    }
}
