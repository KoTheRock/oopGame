package units;

public class Pikeman extends Person {
    public Pikeman(String name, int x, int y) {
        super(name, 80, 30, 35, 30, 50, "Spire", 20, 0, 0);
        this.position = new Point2D(x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    } 
    public String getTypeName() {
        return "Копейщик";
    }

    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }
}
