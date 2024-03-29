package L05_12_OOP_Practice;

public abstract class c1l12_Hero<T> {
    private String name;
    private int damage;

    private T weapon;

    public c1l12_Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(c4l12_Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
