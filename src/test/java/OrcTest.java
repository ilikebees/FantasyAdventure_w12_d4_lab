import Enemies.Orc;
import Enums.Treasure;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    private Orc orc;
    private Orc orc2;
    private Knight knight;

    @Before
    public void setUp() {
        orc = new Orc("Merribell the Terribell", Treasure.AMULET);
        orc2 = new Orc("Steve", Treasure.GEM);
        knight = new Knight("Laura");
    }

    @Test
    public void hasName() {
        assertEquals("Merribell the Terribell", orc.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(30, orc.getHealth());
    }

    @Test
    public void hasLoot() {
        assertEquals(Treasure.AMULET, orc.getLoot());
    }

    @Test
    public void hasPower() {
        assertEquals(4, orc.getPower());
    }

    @Test
    public void canLoseHealth() {
        orc.loseHealth(10);
        assertEquals(20, orc.getHealth());
    }


    @Test
    public void canAttackAndBeDamaged() {
        orc.attack(orc2);
        assertEquals(26, orc2.getHealth());
    }

    @Test
    public void canRelinquishLoot() {
        knight.attack(orc);
        knight.attack(orc);
        knight.attack(orc);
        knight.attack(orc);
        knight.attack(orc);
        knight.lootEnemy(orc);
        assertEquals(Treasure.AMULET, knight.getTreasures().get(0));
        assertEquals(null, orc.getLoot());
    }

    @Test
    public void canNotRelinquishLootIfAlive() {
        knight.attack(orc);
        knight.attack(orc);
        knight.attack(orc);
        knight.attack(orc);
        knight.lootEnemy(orc);
        assertEquals(0, knight.getTreasures().size());
        assertEquals(Treasure.AMULET, orc.getLoot());
    }


}
