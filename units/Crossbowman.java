package units;

import java.util.ArrayList;

import behavior.Point2D;

public class Crossbowman extends Person {
    private int ammo;
    private int effectiveDistance;

    public Crossbowman (String name, int x, int y) {
        super(name, 3, 60, 40, 30, 20, 40, "gun",40, x, y);
        this.position = new Point2D(x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    }
    public String getTypeName() {
        return "Арбалетчик";
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
    protected void shot(Person target)
    {
        ammo--;
        int dist = distanceTo(target);
        int damage = Math.round((float) power / 10) * 5;
        if (dist > effectiveDistance)
            damage *= 0.5f;
        else if (dist < effectiveDistance)
            damage *= 1.2f;
    }
    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }

    @Override
    public void step()
    {
        if (health <= 0 || ammo <= 0)
         return;
        
        Person target = this.findNearestEnemy(enemies);
        if (target != null)
        {
            shot(target);
        }

    }
}
