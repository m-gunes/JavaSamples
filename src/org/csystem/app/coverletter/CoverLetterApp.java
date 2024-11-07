package org.csystem.app.coverletter;

import java.util.Scanner;

public class CoverLetterApp {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Company name:");
        String company = kb.nextLine();

        System.out.print("Sector name:");
        String sector = kb.nextLine();

        System.out.print("motivation:");
        String motivation = kb.nextLine();

        CoverLetterContent letter = new CoverLetterContent(company, sector, motivation);
        System.out.println(letter.getLetter());

    }
}
