package org.csystem.app.grades;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class Exam {
    private String lectureName;
    private int [][] grades;
    private double [] averages;
    private double average;

    public Exam(String name, int nClasses)
    {
        lectureName = name;
        grades = new int[nClasses][];
    }

    public int getNumberOfClasses()
    {
        return grades.length;
    }
    public int getNumberOfStudent(int i)
    {
        return grades[i].length;
    }
    public void setNumberOfStudent(int i, int n)
    {
        grades[i] = new int[n];
    }
    public void setGrade(int i, int k, int grade)
    {
        grades[i][k] = grade;
    }
    public void generateGrades(Random r)
    {
        for (int i = 0; i < grades.length; ++i)
            for (int k = 0; k < grades[i].length; ++k)
                setGrade(i, k, r.nextInt(0, 11));
    }

    public int [] getGrade(int i)
    {
        return grades[i];
    }

    private void setAverage(int n)
    {
        int total = 0;

        for (int i = 0; i < grades[n].length; ++i)
            total += grades[n][i];

        averages[n] = (double) total / grades[n].length;
    }

    public double getAverage(int i)
    {
        return averages[i];
    }

    public void setAverages()
    {
        averages = new double[grades.length];

        for (int i = 0; i < grades.length; ++i)
            setAverage(i);

        setSchoolAverage();
    }
    public double getSchoolAverage()
    {
        return average;
    }
    private void setSchoolAverage()
    {
        double total = 0.0;
        for(double val : averages)
            total += val;

        average =  total / averages.length;
    }

    public String getLectureName()
    {
        return lectureName;
    }

    public void setLectureName(String value)
    {
        lectureName = value;
    }

    public int [] getGradeHistogramData(int i)
    {
        return ArrayUtil.histogramData(grades[i], 10);
    }
    public int [] getSchoolHistogramData()
    {
        int [][] data = new int[grades.length][];

        for (int i = 0; i < data.length; ++i)
            data[i] = getGradeHistogramData(i);

        int [] schoolData =  new int[11];

        for (int i = 0; i < data[0].length; ++i)
            for (int k = 0; k < data.length; ++k )
                schoolData[i] += data[k][i];

        return schoolData;
    }

}
