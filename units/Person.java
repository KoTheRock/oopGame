package units;

public abstract class Person {
    protected String name;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int mana;
    protected int endurance;
    protected String weapon;
    protected int gold;
    protected Point2D position;

    public Person(String name, int health, int power, int age, int armor,
    int endurance, String weapon, int gold, int x, int y) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        position = new Point2D(0, 0);

    }

    public void setPosition(int x, int y) {
        position.set(x);
        position.set(y);
    }

    public int distanceTo(Person target) {
        return (int) Math.sqrt(Math.pow(position.getX() - target.position.getX(), 2) + Math.pow(position.getY() - target.position.getY(), 2));
    }


    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + name + ": " + position;
    }

}