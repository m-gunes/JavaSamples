package org.csystem.app.school;

import java.util.Scanner;

public class GradeInfoApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("Input student info:");
            String s = kb.nextLine();
            if("quit".equals(s))
                break;

            GradeInfo gradeInfo = GradeInfoHelper.parse(s);
            GradeInfoHelper.printGrade(gradeInfo);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
