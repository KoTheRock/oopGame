package units;

import behavior.Point2D;

public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Peasant(String name, int x, int y) {
        super(name, 0, 20, 5, 40, 0, 20, "nothing", 20, 0, 0);
        this.position = new Point2D(x, y);
    }
    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if (!isInGame()) {
            inGame = false;
        }
    }

    public boolean isInGame() {
        if (this.arrowsNum == 0) {
            return  false;
    } else {
        return this.arrowsNum == 0 ? false : true;
        }
    }
    public String getTypeName() {
        return "Крестьянин";
    }

    @Override
    public String toString() {
        return getTypeName() + ": " + name + ": " + position;
    }
}
