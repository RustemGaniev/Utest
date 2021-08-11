package Weapon;

public class Pistol extends Weapon {

    @Override
    public String shot() {
        String voice = " Пиф! Паф!";
        return voice;
    }

    @Override
    public String getName() {
        String name = "Pistol";
        return name;
    }
}