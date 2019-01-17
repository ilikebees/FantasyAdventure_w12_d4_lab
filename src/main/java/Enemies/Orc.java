package Enemies;

import Interfaces.ILootable;

public class Orc extends Enemy{

    public Orc(String name, ILootable loot) {
        super(name, loot);
        this.maxHealth = 30;
        this.health = 30;
        this.power = 4;
    }


}
