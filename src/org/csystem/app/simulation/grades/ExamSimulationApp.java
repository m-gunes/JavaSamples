package org.csystem.app.simulation.grades;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulationApp {
    private static void setGrades(Classroom classroom)
    {
        Random random = new Random();
        int n = classroom.getNumberOfStudents(); // get metodunu cagirmak yerine yukardan parametre olarak gecilebilirdi
        for (int i = 0; i < n; ++i) {
            String firstName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 10));
            String lastName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 10));
            classroom.setGrade(i, new GradeInfo("%s %s".formatted(firstName, lastName), random.nextInt(11))); // m_grades[i] = gradeInfo;
        }
    }

    private static Exam createExam(String lectureName, int nClasses, Scanner kb)
    {
        Exam exam = new Exam(lectureName, nClasses);

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("%d. Sube ogrenci sayisini giriniz:", i+1);
            Classroom classroom = new Classroom(Integer.parseInt(kb.nextLine()));
            setGrades(classroom);
            exam.setClassroom(i, classroom); // m_classrooms[i] = classroom;
        }

        return exam;
    }
    public static void printReport(Exam exam)
    {
        System.out.printf("%s dersi notlari:%n", exam.getLectureName());
        int nClasses = exam.getNumberOfClassrooms();

        for (int i = 0; i < nClasses; ++i) {
            int nStudents = exam.getNumberOfStudents(i);
            System.out.printf("%d. Sube:%n", i+1);
            for(int k = 0; k < nStudents; ++k)
                System.out.printf("%s ", exam.getGradeInfo(i, k).toString()); // grade info gelebilir
            System.out.printf("%nOrtalama: %f%n------%n", exam.getAverage(i));
        }
        System.out.printf("Okul ortalamasi: %f%n", exam.getAverage());
    }

    public static void drawHistogram(int [] data, int n, char ch)
    {
        int maxValue = ArrayUtil.max(data);

        for (int grade : data) {
            int count = (int)Math.floor(grade * n / (double)maxValue);

            while (count-- > 0)
                System.out.print(ch);

            System.out.println();
        }
    }

    public static void drawHistogram(Classroom classroom, int maxGrade)
    {
        int [] data = classroom.histogramData(maxGrade);
        ArrayUtil.print(data);
        drawHistogram(data, 10, '-');
    }

    public static void drawHistogram(Exam exam)
    {
        System.out.println("Histogram:");
        int nClasses = exam.getNumberOfClassrooms();
        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("%d. Sube histogram verisi: %n", i+1);
            drawHistogram(exam.getClassroom(i), exam.getMaxGrade()); // exam.getClassroom(i).histogramData(exam.getMaxGrade()));
        }
        System.out.printf("%s dersi okul histogrami: ", exam.getLectureName());
        int [] data = exam.getHistogramData();
        ArrayUtil.print(data);
        drawHistogram(data, 20, '-');
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Ders adini giriniz:");
        String lectureName = kb.nextLine();

        System.out.print("Sube sayisini giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        Exam exam = createExam(lectureName, n, kb);
        exam.calculate();
        printReport(exam);
        drawHistogram(exam);
    }

    public static void main(String[] args)
    {
        run();
    }
}
