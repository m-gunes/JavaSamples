package org.csystem.app.simulation.grades;

public class GradeInfo {
    private String m_studentName;
    private int m_grade;

    public GradeInfo(String studentName, int grade)
    {
        m_studentName = studentName;
        m_grade = grade;
    }

    public String getStudentName()
    {
        return m_studentName;
    }

    public void setStudentName(String studentName)
    {
        m_studentName = studentName;
    }

    public int getGrade()
    {
        return m_grade;
    }

    public void setGrade(int grade)
    {
        m_grade = grade;
    }

    public String toString()
    {
        return "Name: %s Grade: %d, ".formatted(m_studentName, m_grade);
    }
}
