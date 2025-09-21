package org.csystem.app.company;

import org.csystem.app.company.employee.*;
import org.csystem.app.company.hr.HumanResources;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

public class DemoCompanyApp {

    private static Manager getManager()
    {
       return new Manager("Mustafa Gunes", "1234234141324", "Wassenberg", "Software", 300000);
    }

    private static Worker getWorker()
    {
        return new Worker("Mevlut Ozkan", "123412341234", "Mecidiyekoy", 400, 8);
    }

    private static ProjectWorker getProjectWorker()
    {
        return new ProjectWorker("Murat Gunes", "23456789233", "Kadikoy", 200, 8, "Dernek", 2000);
    }

    private static SalesManager getSalesManager()
    {
        return new SalesManager("Ali Serçe", "34567892345", "Geyikli", "Pazarlama", 400000, 30000);
    }

    private static Employee getEmployee(Random random)
    {
        return switch (random.nextInt(4)) {
            case 0 -> getWorker();
            case 1 -> getProjectWorker();
            case 2 -> getSalesManager();
            default -> getManager();
        };
    }

    public static void run()
    {
        Random random = new Random();
        HumanResources humanResources = new HumanResources();
        while (true) {
            Employee employee = getEmployee(random);
            humanResources.payInsurance(employee);
            ThreadUtil.sleep(1000);
        }
    }

    public static void main(String[] args)
    {
       run();
    }
}
