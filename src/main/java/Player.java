package com.company;


import Weapon.*;


public class Player {
    Weapon[] weaponSlots;


    public Player() {

        weaponSlots = new Weapon[]{
                new Pistol(),
                new Rpg(),
                new SnyperGun(),
                new MashinGun()
        };
    }

    public Weapon getWeapon(int slot) {
        return weaponSlots[slot];
    }

    public int getSlotsCount() {

        return weaponSlots.length;
    }



    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];

        System.out.println(weapon.shot());
    }
}

