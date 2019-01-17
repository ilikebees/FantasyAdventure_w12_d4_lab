package Enemies;

import Interfaces.IAttackable;
import Interfaces.ILootable;

public abstract class Enemy implements IAttackable {

    private String name;
    protected int health;
    protected int maxHealth;
    protected int power;
    protected ILootable loot;
    protected Boolean dead;

    public Enemy(String name, ILootable loot) {
        this.name = name;
        this.loot = loot;
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public ILootable getLoot() {
        return loot;
    }

    public Boolean getDead() {
        return dead;
    }

    public void loseHealth(int totalAmount){
        this.health -= totalAmount;
        if (this.health <= 0) {
            this.die();
        }
    }

    public void takeDamage(int totalAmount){
        loseHealth(totalAmount);
    }

    public ILootable giveUpLoot(){
        ILootable prize = this.loot;
        this.loot = null;
        return prize;
    }

    public void attack(IAttackable target) {
        target.takeDamage(this.power);
    }

    public void die(){
        this.dead = true;
    }


}
