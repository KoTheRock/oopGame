import java.util.ArrayList;
import java.util.Random;

import units.*;
public class Main {

    static ArrayList<Person> red = new ArrayList<>();
    static ArrayList<Person> blue = new ArrayList<>();
    static ArrayList<Person> all = new ArrayList<>();

    public static void main(String[] args) {
        createTeam(red, 10, 0);
        createTeam(blue, 10, 3);
        System.out.println(red);
        System.out.println(blue);
        System.out.println();
        all.addAll(red);
        all.addAll(blue);
        all.sort(new PrioritySort());

        for (Person p : all)
        {
            System.out.println(p + " ходит");
            p.step();
        }
        


        // Sniper sniper = new Sniper(getName(), 7, 5);
        // Person target = sniper.findNearestEnemy(blue);
        // System.out.println("Ближайшая цель это " + target);
    }
    public static void createTeam(ArrayList<Person> team, int num, int start) 
    {
        Random rnd = new Random();
        while (--num >= 0) 
        {
            int n = start + rnd.nextInt(4);
            switch (n) 
            {
                case 0:
                    team.add(new Crossbowman(getName(), 0, num));
                    break;
                case 1:
                    team.add(new Pikeman(getName(), 0, num));
                    break;
                case 2:
                    team.add(new Wizard(getName(), 0, num));
                    break;
                case 3:
                    team.add(new Peasant(getName(),start * 3, num));
                    break;
                case 4:
                    team.add(new Sniper(getName(), 9, num));
                    break;
                case 5:
                    team.add(new Monk(getName(), 9, num));
                    break;
                case 6:
                    team.add(new Robber(getName(), 9, num));
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }   
}