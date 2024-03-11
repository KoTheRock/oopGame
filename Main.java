import units.*;
public class Main {

    public static void main(String[] args) {
        Robber robber = new Robber("Maxim", 22);
        Peasant peasant = new Peasant("Nikita", 22);
        Sniper sniper = new Sniper("Viktor", 22);
        Wizard wizard = new Wizard("Roman", 22);
        Pikeman pikeman = new Pikeman("Ilya", 22);
        Crossbowman crossbowman = new Crossbowman("Alexey", 22);
        Monk monk = new Monk("Maxim", 22);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}