package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public Boss(int health, int damage, String defenceType) {
        this.health = health;
        this.damage = damage;
        this.defenseType = defenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}
