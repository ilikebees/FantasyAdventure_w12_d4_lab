package Players;

import Enums.ArmorType;
import Enums.ShieldType;
import Enums.WeaponType;

public class Knight extends Player {
    private int freeHands;
    private WeaponType weapon;
    private ShieldType shield;
    private ArmorType armor;

    public Knight(String name){
        super(name);
        this.maxHealth = 50;
        this.health = 50;
        initialArmourSetup();
    }

    private void initialArmourSetup() {
        this.weapon = WeaponType.SHORTSWORD;
        this.armor = ArmorType.LEATHER;
        this.shield = null;
    }

    public int getFreeHands() {
        return freeHands;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public ShieldType getShield() {
        return shield;
    }

    public ArmorType getArmor() {
        return armor;
    }
}
