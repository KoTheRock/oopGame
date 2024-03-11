package units;

public class Monk extends Person {
    private int mana;
    private int healVal;
    private int healPrice;
    public Monk (String name, int age) {
        super(name, 80, 30, age, 5, 30, "Stick", 30);
    }
    public void heal(Person person, int val){
        person.health += this.healVal;
        this.mana -= price("heal");
    }
    public void heal(int val){
        super.health += this.healVal;
        this.mana -= price("heal");
    }
    private int price(String action) {
        if (action == "heal") return healPrice;
        return 0;
    } 
}
