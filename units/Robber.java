package units;

import behavior.Point2D;

public class Robber extends Person {
    public Robber(String name, int x, int y) {
        super(name, 2, 100, 10, 27, 20, 40, "knife", 50, 0, 0);
        this.position = new Point2D(x, y);
    }
    public void attack(Person person) {
        person.health -= super.power;
    }
    public void stealGold(int val) {
        this.gold += val;
    }
    public String getTypeName() {
        return "Разбойник";
    }

    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }
}
