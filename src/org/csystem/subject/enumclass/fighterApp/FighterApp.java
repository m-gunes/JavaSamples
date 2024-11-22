package org.csystem.subject.enumclass.fighterApp;

public class FighterApp {
    public static void main(String[] args)
    {
        Fighter f = new Fighter();
        f.setHealth(90);
        f.setStrength(40);
        f.setAgility(79);
        f.setRange(34);
        f.setSpeed(250);

        System.out.println(f.averageOfAbilities());
        System.out.println(f.totalOfAbilities());
    }
}
