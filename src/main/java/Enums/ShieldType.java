package Enums;

import Interfaces.ILootable;

public enum ShieldType implements ILootable {
    WOODEN(1, "Wooden"),
    STEEL(3, "Steel"),
    MITHRIL(5, "Mithril");

    private int defence;
    private String stringName;

    ShieldType(int defence, String stringName) {
        this.defence = defence;
        this.stringName = stringName;
    }

    public int getDefence() {
        return defence;
    }

    public String getStringName() {
        return stringName;
    }
}
