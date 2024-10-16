package org.csystem.app.simulation.grades;

public class Classroom {
    private GradeInfo [] m_grades;

    public Classroom(int nStudents)
    {
        m_grades = new GradeInfo[nStudents];
    }

    public GradeInfo getGradeInfo(int i)
    {
        return m_grades[i];
    }

    public void setGrade(int i, GradeInfo gradeInfo)
    {
        m_grades[i] = gradeInfo;
    }

    public int getNumberOfStudents()
    {
        return m_grades.length;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = ", ";

        for (GradeInfo gi : m_grades)
            sb.append(gi.toString()).append(delimiter); // Todo: toString() 'e gerek var mi?

        return sb.substring(0, sb.length() - delimiter.length()) + "]"; // Todo: substring() metodunu neden kullandigimizi anlamadim!
    }
}

