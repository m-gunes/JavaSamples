package org.csystem.app.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class Section {
    public int numberOfStudents;
    public int[] notes;
    public Random random;

    public Section(Random r, int numberOfStudents)
    {
        random = r;
        numberOfStudents = numberOfStudents;
    }

    public int[] createNotes()
    {
        int [] notes = new int[numberOfStudents];

        for(int i = 0; i < numberOfStudents; ++i)
            notes[i] = random.nextInt(0, 10);

        return notes;
    }

    public int getPhysicsClassAverage()
    {
        int total = 0;

        for(int note : notes)
            total += note;

        return total / numberOfStudents;
    }

    public int [] getNotesHistogramData()
    {
        return ArrayUtil.histogramData(notes, 10);
    }
}
