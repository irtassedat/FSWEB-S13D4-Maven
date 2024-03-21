package org.example;

public enum Weapon {
    // Enum sabitleri ve her biri için özellikler
    SWORD(10, 1.5),
    BOW(8, 2.0),
    AXE(12, 1.2); // İsteğe bağlı olarak daha fazla silah ekleyebilirsiniz.

    private final int damage; // Silahın verdiği hasar miktarı
    private final double attackSpeed; // Saldırı hızı

    // Enum constructor'ı, her bir silah için özelliklerin atanması
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Hasar miktarını döndüren metod
    public int getDamage() {
        return damage;
    }

    // Saldırı hızını döndüren metod
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
