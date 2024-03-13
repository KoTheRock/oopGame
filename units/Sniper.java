package units;
import java.util.ArrayList;

public class Sniper extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Sniper(String name, int x, int y) {
        super(name, 60, 40, 28, 20, 40, "gun", 40, 0, 0);
        this.position = new Point2D(x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    }

    public boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }

    public Person findNearestEnemy(ArrayList<Person> enemies)
    {
        Person target = null;
        int distance = Integer.MAX_VALUE;
        
        for (Person p : enemies)
        {
            if(p.distanceTo(this) < distance)
            {
                distance = p.distanceTo(this);
                target = p;
            }
        }
        return target;
    }

    public String getTypeName() {
        return "Снайпер";
    }


    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }
}
