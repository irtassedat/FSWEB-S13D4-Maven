package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.max(0, Math.min(100, healthPercentage));
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.healthPercentage = Math.max(0, this.healthPercentage - damage);
        if (this.healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage = Math.min(100, this.healthPercentage + healthPotion);
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }
}
