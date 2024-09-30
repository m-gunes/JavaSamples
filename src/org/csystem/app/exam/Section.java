package org.csystem.app.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class Section {
    public char name;
    public int numberOfStudents;
    public int[] notes;
    public Random random;

    public Section(Random r, char sectionName, int studentCount)
    {
        random = r;
        name = sectionName;
        numberOfStudents = studentCount;
    }

    public void createNotes()
    {
        notes = new int[numberOfStudents];

        for(int i = 0; i < numberOfStudents; ++i)
            notes[i] = random.nextInt(0, 10);
    }

    public double getPhysicsClassAverage()
    {
        int total = 0;

        for(int note : notes)
            total += note;

        return (double) total / numberOfStudents;
    }

    public int [] getNotesHistogramData()
    {
        return ArrayUtil.histogramData(notes, 10);
    }
}
