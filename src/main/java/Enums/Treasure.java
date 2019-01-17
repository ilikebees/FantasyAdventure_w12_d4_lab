package Enums;

public enum Treasure {

    GEM(20, "Gem"),
    GOLD(10, "Gold Piece"),
    AMULET(40, "Enchanted Amulet");


    private int value;
    private String stringName;

    Treasure(int value, String stringName) {
        this.value = value;
        this.stringName = stringName;
    }

    public int getValue() {
        return value;
    }

    public String getStringName() {
        return stringName;
    }
}
