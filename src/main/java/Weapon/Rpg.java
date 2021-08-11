package Weapon;

public class Rpg extends Weapon {

    @Override
    public String shot() {
        String voice = " Ба-Баххх!!!! ";
        return voice;
    }

    @Override
    public String getName() {
        String name = "Rpg";
        return name;
    }
}
