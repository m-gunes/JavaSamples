package org.csystem.app.generator;

import org.csystem.generator.object.ObjectArrayGenerator;
import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.wrapper.primitive.IntValue;

import java.util.Scanner;

public class DemoObjectArrayGeneratorApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a number:");
        int count = kb.nextInt();

        ObjectArrayGenerator generator = new ObjectArrayGenerator();

        for (Object o: generator.createObjects(count)) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.printf("Dynamic type:%s%n", o.getClass().getName());

            if (o instanceof String) {
                String s = (String)o;
                String upper = s.toUpperCase();

                System.out.printf("Text:%s, Upper:%s%n", s, upper);
            }
            else if (o instanceof IntValue) {
                IntValue iVal = (IntValue)o;
                int val = iVal.getValue();

                System.out.printf("%d * %d = %d%n", val, val, val * val);
            }
            else if (o instanceof Point) {
                Point p = (Point)o;

                System.out.printf("Distance to origin:%f%n", p.euclideanDistance());
            }
            else if (o instanceof Circle) {
                Circle c = (Circle)o;

                System.out.printf("Radius:%f, Area:%f, Circumference:%f%n", c.getRadius(), c.getArea(), c.getCircumference());
            }
            else {
                Complex c = (Complex)o;

                System.out.printf("||%s|| = %f%n", c.toString(), c.getLength());
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }

    }

    public static void main(String[] args)
    {
        run();
    }
}
