package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(5000, 130, "Magical");
        System.out.println("Boss's health: " + boss.getHealth() + "\n" + "Boss's damage: " +
                boss.getDamage() + "\n" + "Boss's defence type: " + boss.getDefenseType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Information about hero" + (i + 1) + ":" + createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSkill());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(750, 100, "Physical");
        Hero hero2 = new Hero(2000, 20, "Block");
        Hero hero3 = new Hero(600, 150);

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }
}