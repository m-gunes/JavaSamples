package org.csystem.app.simulation.grades;

public class Exam {
    private String m_lectureName;
    private Classroom [] m_classrooms;
    private double [] m_averages;
    private double m_average;

    public Exam(String lectureName, int nClasses)
    {
        m_lectureName = lectureName;
        m_classrooms = new Classroom[nClasses];
        m_averages = new double[nClasses];
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public double getGrade(int i, int k) // `i`'inci subenin `k` numarali ogrencisi
    {
        return getGradeInfo(i, k).getGrade();
    }

    public GradeInfo getGradeInfo(int i, int k)
    {
        return m_classrooms[i].getGradeInfo(k);
    }

    public int getNumberOfClassrooms()
    {
        return m_classrooms.length;
    }

    public void setClassroom(int i, Classroom classroom)
    {
        m_classrooms[i] = classroom;
    }

    public int getNumberOfStudents(int i)
    {
        return m_classrooms[i].getNumberOfStudents();
    }

    public void setGrade(int i, int k, GradeInfo gradeInfo)
    {
        m_classrooms[i].setGrade(k, gradeInfo);
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }
}
