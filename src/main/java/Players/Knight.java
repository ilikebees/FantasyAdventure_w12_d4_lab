package Players;

import Enums.ArmorType;
import Enums.ShieldType;
import Enums.WeaponType;
import Interfaces.IAttackable;

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
        updateFreeHands();
    }

    private void initialArmourSetup() {
        this.weapon = WeaponType.SHORTSWORD;
        this.armor = ArmorType.LEATHER;
        this.shield = null;
    }

    public void updateFreeHands() {
        int hands = 2;
        if (this.weapon != null){
            hands -= this.weapon.getHandReq();
        }
        if (this.shield != null){
            hands -= this.weapon.getHandReq();
        }
        this.freeHands = hands;
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

    public void takeDamage(int total){
        int reducedDamage = total;
        if (this.armor != null) {
            reducedDamage -= this.armor.getDefence();
        }
        if (this.shield != null) {
            reducedDamage -= this.shield.getDefence();
        }
        loseHealth(reducedDamage);
    }

    public void attack(IAttackable target) {
        target.takeDamage(this.weapon.getDamage());
    }
}
