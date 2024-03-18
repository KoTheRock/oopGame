package units;


import java.util.ArrayList;

import behavior.ActionInterface;
import behavior.Point2D;

public abstract class Person implements ActionInterface {
    protected String name;
    protected int priority;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int mana;
    protected int endurance;
    protected String weapon;
    protected int gold;
    protected Point2D position;
    protected ArrayList<Person> enemies;

    public Person(String name, int priority, int health, int power, int age, int armor,
    int endurance, String weapon, int gold, int x, int y) {
        this.name = name;
        this.priority = priority;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        position = new Point2D(0, 0);
        enemies = new ArrayList<>();

    }

    // public void setPosition(int x, int y) {
    //     position.set(x);
    //     position.set(y);
    // }

    public int distanceTo(Person target) 
    {
        return (int) Math.sqrt(Math.pow(position.getX() - target.position.getX(), 2)
                + Math.pow(position.getY() - target.position.getY(), 2));

    }

    public int getDamage(int damage)
    {
        int loss = damage - (this.armor * damage) / 100;
        loss = Math.min(loss, this.health);
        this.health -= loss;
        if (this.health <= 0)
        {
            System.out.println(name + ": Почему тут нету помощи!");
        }
        return loss;
    }


    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + name + ": " + position;
    }

    @Override
    public void step()
    {

    }
}