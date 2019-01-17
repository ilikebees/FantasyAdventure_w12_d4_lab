package Enums;

public enum ArmorType {

    LEATHER(1, "Leather"),
    STEEL(3, "Steel"),
    MITHRIL(8, "Mithril");

    private int defence;
    private String stringName;

    ArmorType(int defence, String stringName){
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


