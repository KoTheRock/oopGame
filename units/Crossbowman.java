package units;

public class Crossbowman extends Person {
    public Crossbowman (String name, int x, int y) {
        super(name, 60, 40, 30, 20, 40, "gun",40, x, y);
        this.position = new Point2D(x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    }
    public String getTypeName() {
        return "Арбалетчик";
    }
    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }
}
