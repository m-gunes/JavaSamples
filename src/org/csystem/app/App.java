package org.csystem.app;

import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;

class App {
    public static void main(String[] args)
    {
        int a = 10;
        double b = 10.5;
        boolean c = true;
        Circle ci = new Circle(100.5);
        Point p = Point.createCartesian(300, 67.8);

        System.out.println("Circle -> " + ci);
        System.out.println("Point -> " + p);
        System.out.print(1);
        System.out.printf("a = %s, b = %s, c = %s%n", Integer.valueOf(a), b, c);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.print("a:" + Integer.valueOf(a).toString());

        System.out.println("-----");

        Sample s = new Sample();
        Sample s2= new Sample();
        System.out.println(s);
        System.out.println(s2);
    }
}

class Sample {

}