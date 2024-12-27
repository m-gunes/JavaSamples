package org.csystem.subject.relations.exgame;

/**
 * Bunu bir oyun gibi dusunebiliriz. Oyunun bir uzayinda Plane sinifi, baska bir uzayinda Car sinifi varmis gibi.<p>
 *
 * Plane ---> Engine iliskisi Composition <p>
 * Plane ---> Pilot iliskisi Aggregation <p>
 * Car -----> Engine iliskisi Compositon <p>
 * Car -----> Driver iliskisi Aggregation <p>
 */
public class RaceApp {
    public static void main(String[] args)
    {
        Driver driver = new Driver();
        driver.setName("Mustafa Gunes");
        driver.setRating(100);
        Car car = new Car(driver);
        car.run();
        System.out.println("---------------------");

        Pilot [] pilots = {new Pilot(1, 5000, "Veronica Peselmann"), new Pilot(2, 4000, "Murat Gunes"), new Pilot(3, 2000, "Baho Gunes")};
        Plane plane = new Plane(4, pilots);
        plane.fly();
    }
}

class Plane {
    private final Engine [] m_engines;
    private Pilot [] m_pilots;

    public Plane(int n, Pilot[] pilot)
    {
        m_engines = new Engine[n];
        m_pilots = pilot;

        for (int i = 0; i < n; ++i)
            m_engines[i] = new Engine();
    }

    private void startEngines()
    {
        for (Engine e : m_engines)
            e.startEngine();
    }

    private void accelerateEngines()
    {
        for (Engine e : m_engines)
            e.accelerateEngine();
    }

    private void slowEngines()
    {
        for (Engine e : m_engines)
            e.slowEngine();
    }

    private void stopEngines()
    {
        for (Engine e : m_engines)
            e.stopEngine();
    }

    public void fly()
    {
        for (Pilot p : m_pilots)
            System.out.printf("%d %s %d%n", p.getTitle(), p.getName(), p.getFlightDuration());

        startEngines();
        accelerateEngines();
        //..
        System.out.println("flying");
        slowEngines();
        stopEngines();
    }
}

class Car {
    private final Engine m_engine;
    private Driver m_driver;

    public Car(Driver driver)
    {
        m_engine = new Engine();
        m_driver = driver;
    }

    public void brake()
    {
        m_engine.slowEngine();
    }

    public void run()
    {
        System.out.printf("Driver: %s, %d%n", m_driver.getName(), m_driver.getRating());
        m_engine.startEngine();
        m_engine.accelerateEngine();

        System.out.println("Running");

        brake();
        m_engine.stopEngine();
    }

    public Driver getDriver()
    {
        return m_driver;
    }

    public void setDriver(Driver driver)
    {
        m_driver = driver;
    }
}

class Pilot {
    private int m_title;
    private int m_flightDuration;
    private String m_name;

    public Pilot(int title, int flightDuration, String name)
    {
        m_title = title;
        m_flightDuration = flightDuration;
        m_name = name;
    }

    public int getTitle()
    {
        return m_title;
    }

    public void setTitle(int title)
    {
        m_title = title;
    }

    public int getFlightDuration()
    {
        return m_flightDuration;
    }

    public void setFlightDuration(int flightDuration)
    {
        m_flightDuration = flightDuration;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }
}

class Driver {
    private String m_name;
    private int m_rating;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getRating()
    {
        return m_rating;
    }

    public void setRating(int rating)
    {
        m_rating = rating;
    }
}

class Engine {
    public void startEngine()
    {
        System.out.println("Start Engine");
    }
    public void accelerateEngine()
    {
        System.out.println("Accelerate Engine");
    }
    public void slowEngine()
    {
        System.out.println("Slow Engine");
    }
    public void stopEngine()
    {
        System.out.println("Stop Engine");
    }
}
