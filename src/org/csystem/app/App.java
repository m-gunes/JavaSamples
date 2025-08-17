package org.csystem.app;

import org.csystem.math.geometry.Point;
import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        Point origin = Point.createCartesian(0, 0);
        Random r = new Random();

        while (true) {
            Point point = Point.createCartesian(r.nextInt(-1, 1), r.nextInt(-1, 1));

            Console.writeLine(point);

            if (point.equals(origin))
                break;

            ThreadUtil.sleep(1000);
        }
    }
}