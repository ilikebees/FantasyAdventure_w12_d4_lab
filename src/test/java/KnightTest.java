import Enums.ArmorType;
import Enums.ShieldType;
import Enums.Treasure;
import Enums.WeaponType;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Knight knight2;

    @Before
    public void setUp(){
        knight = new Knight("Balthazar");
        knight2 = new Knight("Edmond");
    }

    @Test
    public void hasName() {
        assertEquals("Balthazar", knight.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SHORTSWORD, knight.getWeapon());
    }

    @Test
    public void hasFreeHands() {
        assertEquals(1, knight.getFreeHands());
    }

    @Test
    public void hasNoShield() {
        assertEquals(null, knight.getShield());
    }

    @Test
    public void hasBasicArmor() {
        assertEquals(ArmorType.LEATHER, knight.getArmor());
    }

    @Test
    public void hasHealth() {
        assertEquals(50, knight.getHealth());
    }

    @Test
    public void hasNoTreasure() {
        assertEquals(0, knight.getTreasures().size());
    }

    @Test
    public void canLoseHealth() {
        knight.loseHealth(10);
        assertEquals(40, knight.getHealth());
    }

    @Test
    public void canGainHealth() {
        knight.loseHealth(10);
        assertEquals(40, knight.getHealth());
        knight.gainHealth(5);
        assertEquals(45, knight.getHealth());
    }


    @Test
    public void cantGoOver50Health() {
        knight.loseHealth(10);
        assertEquals(40, knight.getHealth());
        knight.gainHealth(15);
        assertEquals(50, knight.getHealth());
    }

    @Test
    public void canAttackAndBeDamaged() {
        knight.attack(knight2);
        assertEquals(45, knight2.getHealth());
    }

    @Test
    public void canGetTreasure() {
        knight.addTreasure(Treasure.GEM);
        assertEquals(Treasure.GEM, knight.getTreasures().get(0));
    }

    @Test
    public void canDropWeapon() {
        knight.dropWeapon();
        assertEquals(null, knight.getWeapon());
    }

    @Test
    public void canGetNewWeapon() {
        knight.dropWeapon();
        knight.pickUpWeapon(WeaponType.GREATAXE);
        assertEquals(WeaponType.GREATAXE, knight.getWeapon());
    }

    @Test
    public void canGetNewShield() {
        knight.pickUpShield(ShieldType.MITHRIL);
        assertEquals(ShieldType.MITHRIL, knight.getShield());
    }


}
