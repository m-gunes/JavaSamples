/**
 * Point class that represents a point in geometry
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class Point {
    private double m_x;
    private double m_y;


    private Point(double a, double b, boolean polar)
    {
        m_x = polar ? a * cos(b) : a;
        m_y = polar ? a * sin(b) : b;
    }

    public static Point createCartesian(double x, double y)
    {
        return new Point(x, y, false);
    }

    public static Point createPolar(double r, double theta)
    {
        return new Point(r, theta, true);
    }

    public double getX()
    {
        return m_x;
    }

    public void setX(double x)
    {
        m_x = x;
    }

    public double getY()
    {
        return m_y;
    }

    public void setY(double y)
    {
        m_y = y;
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(Point other)
    {
        return distance(other.m_x, other.m_y);
    }

    public double distance(double a, double b)
    {
        return sqrt(pow(m_x - a, 2) + pow(m_y - b, 2));
    }

    public void offset(double dxy)
    {
        offset(dxy, dxy);
    }

    public void offset(double dx, double dy)
    {
        m_x += dx;
        m_y += dy;
    }

    public String toString()
    {
        return "(%f, %f)".formatted(m_x, m_y);
    }
}