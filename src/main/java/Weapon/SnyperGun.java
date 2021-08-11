package Weapon;

public class SnyperGun extends Weapon {

    @Override
    public String shot() {
        String voice = " Пифффтт! ";
        return voice;
    }
    @Override
    public String getName() {
        String name = "SnyperGun";
        return name;
    }
}
