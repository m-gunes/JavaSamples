package org.csystem.app.grades;

import java.util.Random;

public class Exam {
    public String name;
    public int section;
    public int numberOfStudent;
    public int [] notes;
    private Random r;

    public Exam(String lecture, int sectionNumber, int studentCount, Random r)
    {
        name = lecture;
        section = sectionNumber;
//        section = new int[sectionNumber];
        numberOfStudent = studentCount;
    }

    public static void createNotes()
    {
//        for(int i = 0; i < numberOfStudent; ++i) {
//
//        }

    }

}
