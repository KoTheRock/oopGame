package person;

import behavior.CoordXY;


public class Archer extends ShooterBase {

    private static final int HEALTH = 800;
    private static final int POWER = 35;
    private static final int AGILITY = 20;
    private static final int DEFENCE = 5;
    private static final int DISTANCE = 16;
    private static final int ARROWS = 12;
    private static final int EFFECTIVE_DISTANCE = 3;


    public Archer(String name, CoordXY pos) {
        super(name, 3, HEALTH, POWER, AGILITY, DEFENCE, DISTANCE, ARROWS, EFFECTIVE_DISTANCE, pos);
    }

    @Override
    public String toString() {
        return String.format("[Арбалетчик] %s, ❤️=%d, \uD83C\uDFF9=%d, %s", name, health, ammo, position.toString());
    }

    @Override
    public String getInfo() {
       return "Арбалетчик";
    }

}