package units;
import java.util.ArrayList;

import behavior.Point2D;

public class Sniper extends Person {
    private int ammo;
    private int effectiveDistance;
   


    public Sniper(String name, int x, int y) {
        super(name, 3, 60, 40, 28, 20, 40, "gun", 40, 0, 0);
        this.position = new Point2D(x, y);
    }
    // public void attack(Person person) {
    //     person.health -= this.power;
    // }

    // public boolean isInGame() {
    //     return this.ammo == 0 ? false : true;
    // }

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

    protected void shot(Person target)
    {
        ammo--;
        int dist = distanceTo(target);
        int damage = Math.round((float) power / 10) * 5;
        if (dist > effectiveDistance)
            damage *= 0.5f;
        else if (dist < effectiveDistance)
            damage *= 1.2f;
        
        target.getDamage(damage);
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
