package Enums;

public enum WeaponType {
    SHORTSWORD(6, 1, "Shortsword"),
    MACE(10, 1, "Mace"),
    GREATAXE(15, 2, "Greataxe");


    private int damage;
    private int handReq;
    private String stringName;

    WeaponType(int damage, int handReq, String stringName) {
        this.damage = damage;
        this.handReq = handReq;
        this.stringName = stringName;
    }

    public int getDamage() {
        return damage;
    }

    public int getHandReq() {
        return handReq;
    }

    public String getStringName() {
        return stringName;
    }
}
