package org.csystem.subject.enumclass.fighterApp;


import org.csystem.util.array.ArrayUtil;

/**
 * Soru: Aşağıda implementasyonu verilen sınıfı açıklamalara güncelleyiniz
 * <p></p>
 * Açıklamalar:
 * <p></p>
 * - Sınıfa int türden yeni yetenekler eklenecektir.
 * <p>- Bir yetenek eklendiğinde averageOfAbilities ve totalOfAbilities metotlarının değiştirilmemesi gerekmektedir.
 */

class Fighter_v0 {
    private String m_name;
    private int m_health;
    private int m_strength;
    private int m_agility;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_health;
    }

    public void setHealth(int health)
    {
        m_health = health;
    }

    public int getStrength()
    {
        return m_strength;
    }

    public void setStrength(int strength)
    {
        m_strength = strength;
    }

    public int getAgility()
    {
        return m_agility;
    }

    public void setAgility(int agility)
    {
        m_agility = agility;
    }

    public int totalOfAbilities()
    {
        return m_health + m_strength + m_agility;
    }

    public double averageOfAbilities()
    {
        return totalOfAbilities() / 3.;
    }
}


/**
 * Bir implementasyon şu şekilde olabilir. Sabitlerin hard coded olarak verilmesi dolayısıyla iyi bir yaklaşım değildir
 */
class Fighter_v1 {
    private String m_name;
    private final int [] m_abilities = new int[4];

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_abilities[0];
    }

    public void setHealth(int health)
    {
        m_abilities[0] = health;
    }

    public int getStrength()
    {
        return m_abilities[1];
    }

    public void setStrength(int strength)
    {
        m_abilities[1] = strength;
    }

    public int getAgility()
    {
        return m_abilities[2];
    }

    public int getRange()
    {
        return m_abilities[3];
    }

    public void setRange(int agility)
    {
        m_abilities[3] = agility;
    }

    public void setAgility(int agility)
    {
        m_abilities[2] = agility;
    }

    public int totalOfAbilities()
    {
        return ArrayUtil.sum(m_abilities);
    }

    public double averageOfAbilities()
    {
        return totalOfAbilities() / (double) m_abilities.length;
    }
}

/**
 * Daha okunabilir bir implementasyon şu şekilde olabilir.
 * (Yukaridaki kadar efektif. Hiz olarak bir farki yok. final veri elemanlari sabit ifadesinde deger aliyorlarsa,
 * sabit yazmaktan bir farki yok). Ayrica limited cihazlarda efektif kullanim saglar.
 */
class Fighter_v2 {
    private static final int HEALTH = 0;
    private static final int STRENGTH = 1;
    private static final int AGILITY = 2;
    private static final int RANGE = 3;
    private static final int COUNT = 4;
    private String m_name;
    private final int [] m_abilities = new int[COUNT];

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_abilities[HEALTH];
    }

    public void setHealth(int health)
    {
        m_abilities[HEALTH] = health;
    }

    public int getStrength()
    {
        return m_abilities[STRENGTH];
    }

    public void setStrength(int strength)
    {
        m_abilities[STRENGTH] = strength;
    }

    public int getAgility()
    {
        return m_abilities[AGILITY];
    }

    public void setAgility(int agility)
    {
        m_abilities[AGILITY] = agility;
    }

    public int getRange()
    {
        return m_abilities[RANGE];
    }

    public void setRange(int range)
    {
        m_abilities[RANGE] = range;
    }

    public int totalOfAbilities()
    {
        return ArrayUtil.sum(m_abilities);
    }

    public double averageOfAbilities()
    {
        return totalOfAbilities() / (double) m_abilities.length;
    }
}

/**
 * enum kullanılan bir implementasyon şu şekilde olabilir
 */
public class Fighter {
    private enum Ability {HEALTH, STRENGTH, AGILITY, RANGE, SPEED, COUNT};
    private String m_name;
    private final int [] m_abilities = new int[Ability.COUNT.ordinal()];

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_abilities[Ability.HEALTH.ordinal()];
    }

    public void setHealth(int health)
    {
        m_abilities[Ability.HEALTH.ordinal()] = health;
    }

    public int getStrength()
    {
        return m_abilities[Ability.STRENGTH.ordinal()];
    }

    public void setStrength(int strength)
    {
        m_abilities[Ability.STRENGTH.ordinal()] = strength;
    }

    public int getAgility()
    {
        return m_abilities[Ability.AGILITY.ordinal()];
    }

    public void setAgility(int agility)
    {
        m_abilities[Ability.AGILITY.ordinal()] = agility;
    }

    public int getRange()
    {
        return m_abilities[Ability.RANGE.ordinal()];
    }

    public void setRange(int range)
    {
        m_abilities[Ability.RANGE.ordinal()] = range;
    }

    public int getSpeed()
    {
        return m_abilities[Ability.SPEED.ordinal()];
    }

    public void setSpeed(int speed)
    {
        m_abilities[Ability.SPEED.ordinal()] = speed;
    }

    public int totalOfAbilities()
    {
        return ArrayUtil.sum(m_abilities);
    }

    public double averageOfAbilities()
    {
        return totalOfAbilities() / (double) m_abilities.length;
    }
}
