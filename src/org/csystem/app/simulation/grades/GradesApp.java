package org.csystem.app.simulation.grades;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class GradesApp {
    private static void setGrades(Classroom classroom)
    {
        Random random = new Random();
        int n = classroom.getNumberOfStudents(); // get metodunu cagirmak yerine yukardan parametre olarak gecilebilirdi
        for (int i = 0; i < n; ++i) {
            String firstName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 16));
            String lastName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 16));
            classroom.setGrade(i, new GradeInfo("%s %s".formatted(firstName, lastName), random.nextInt(11))); // m_grades[i] = gradeInfo;
        }
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Ders adini giriniz:");
        String lectureName = kb.nextLine();

        System.out.print("Sube sayisini giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        Exam exam = new Exam(lectureName, n);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d. Sube ogrenci sayisini giriniz:", i+1);
            Classroom classroom = new Classroom(Integer.parseInt(kb.nextLine()));
            setGrades(classroom);
            exam.setClassroom(i, classroom); // m_classrooms[i] = classroom;
        }

        int nClasses = exam.getNumberOfClassrooms();
        for (int i = 0; i < nClasses; ++i) {
            int nStudents = exam.getNumberOfStudents(i);
            for(int k = 0; k < nStudents; ++k)
                System.out.printf(""); // grade info gelebilir
        }


    }

    public static void main(String[] args)
    {
        run();
    }
}
