package Players;

import Enemies.Enemy;
import Enums.Treasure;
import Interfaces.IAttackable;
import Interfaces.ILootable;

import java.util.ArrayList;

public abstract class Player implements IAttackable {

    protected String name;
    protected int maxHealth;
    protected int health;
    protected ArrayList<Treasure> treasures;

    public Player(String name) {
        this.name = name;
        this.treasures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void gainHealth(int amount) {
        if (this.health + amount > this.maxHealth) {
            this.health = this.maxHealth;
        } else {
            this.health += amount;
        }
    }

    public void loseHealth(int amount) {
        this.health -= amount;
        //TODO: Die if 0 or less health.
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void lootEnemy(Enemy baddy){
        if (baddy.getDead()) {
            ILootable loot = baddy.giveUpLoot();
            if (loot instanceof Treasure) {
                this.treasures.add((Treasure) loot);
            }
        }
    }

}
