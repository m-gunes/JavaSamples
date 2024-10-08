package org.csystem.app.grades;

import org.csystem.util.array.ArrayUtil;
import java.util.Random;


public class Exam {
    private String m_lectureName;
    private int [][] m_grades;
    private double [] m_averages;
    private double m_average;

    public Exam(String name, int nClasses)
    {
        m_lectureName = name;
        m_grades = new int[nClasses][];
        // generate grades
    }

    public int getNumberOfClasses()
    {
        return m_grades.length;
    }
    public int getNumberOfStudent(int i)
    {
        return m_grades[i].length;
    }
    public void setNumberOfStudent(int i, int n)
    {
        m_grades[i] = new int[n];
    }
    public void setGrade(int i, int k, int grade)
    {
        m_grades[i][k] = grade;
    }
    public void generateGrades(Random r)
    {
        for (int i = 0; i < m_grades.length; ++i)
            for (int k = 0; k < m_grades[i].length; ++k)
                setGrade(i, k, r.nextInt(0, 11));
    }

    public int [] getGrade(int i)
    {
        return m_grades[i];
    }

    private void setAverage(int n)
    {
        int total = 0;

        for (int i = 0; i < m_grades[n].length; ++i)
            total += m_grades[n][i];

        m_averages[n] = (double) total / m_grades[n].length;
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public void setAverages()
    {
        m_averages = new double[m_grades.length];

        for (int i = 0; i < m_grades.length; ++i)
            setAverage(i);

        setSchoolAverage();
    }
    public double getSchoolAverage()
    {
        return m_average;
    }
    private void setSchoolAverage()
    {
        double total = 0.0;
        for (double val : m_averages)
            total += val;

        m_average =  total / m_averages.length;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String value)
    {
        m_lectureName = value;
    }

    public int [] getGradeHistogramData(int i)
    {
        return ArrayUtil.histogramData(m_grades[i], 10);
    }
    public int [] getSchoolHistogramData()
    {
        int [][] data = new int[m_grades.length][];

        for (int i = 0; i < data.length; ++i)
            data[i] = getGradeHistogramData(i);

        int [] schoolData =  new int[11];

        for (int i = 0; i < data[0].length; ++i)
            for (int k = 0; k < data.length; ++k )
                schoolData[i] += data[k][i];

        return schoolData;
    }

}
