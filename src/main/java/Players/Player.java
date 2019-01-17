package Players;

import Enums.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int maxHealth;
    private int health;
    private ArrayList<Treasure> treasures;

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
}
