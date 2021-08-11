package Weapon;

public class MashinGun extends Weapon {

    @Override
    public String shot() {
        String voice = " Тра-та-та-та-та-та-та-та-та-та-та !!!! ";
        return voice;
    }

    @Override
    public String getName() {
        String name = "MashinGun";
        return name;
    }
}