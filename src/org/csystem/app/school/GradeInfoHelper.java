package org.csystem.app.school;

import org.csystem.app.datetime.DateUtil;

import static java.lang.Integer.parseInt;
import static org.csystem.app.datetime.DateUtil.getDateStrTR;

public class GradeInfoHelper {

    public static GradeInfo parse(String s)
    {
        // 1234:Oğuz Karan:10/09/1976:Matematik:67:100
        String [] info = s.split("[:]+");
        String [] birthDateInfo = info[2].split("[/]");

        GradeInfo gradeInfo = new GradeInfo();
        gradeInfo.number = info[0];
        gradeInfo.name = info[1];
        // gradeInfo.birthDate = info[2];
        gradeInfo.birthDate = getDateStrTR(parseInt(birthDateInfo[0]), parseInt(birthDateInfo[1]), parseInt(birthDateInfo[2]));
        gradeInfo.lectureName = info[3];
        gradeInfo.midtermGrade = parseInt(info[4]);
        gradeInfo.finalGrade = parseInt(info[5]);

        return gradeInfo;
    }

    public static void printGrade(GradeInfo gradeInfo)
    {
        double grade = gradeInfo.getGrade();
        System.out.printf("Student Number: %s%n", gradeInfo.number);
        System.out.printf("Student Name: %s%n", gradeInfo.name);
        System.out.printf("Student BirthDate: %s%n", gradeInfo.birthDate);
        System.out.printf("Student Lecture Name: %s%n", gradeInfo.lectureName);
        System.out.printf("Student Midterm Grade: %d%n", gradeInfo.midtermGrade);
        System.out.printf("Student Final Grade: %d%n", gradeInfo.finalGrade);
        System.out.printf("Student Grade: %.1f%n", grade);
        System.out.printf("Student Status: %s%n", grade > 50 ? "Successful" : "Failed");
    }
}
