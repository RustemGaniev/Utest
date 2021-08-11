import Weapon.*;
import com.company.Player;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

public class WeaponTest {
    Scanner scanner = new Scanner(System.in);

    @org.junit.jupiter.api.Test
    public void testChoosePistol() {

        String expected = " Пиф! Паф!";

        Weapon weapon = new Pistol();
        String actual = weapon.shot();

        Assertions.assertEquals(expected, actual, " Слот Пистолет работает некорректно ");
    }

    @org.junit.jupiter.api.Test
    public void weaponChooseTest() {

        int max = 4;
        int slot = (int) (Math.random() * max);
        System.out.println("Выбран слот " + slot);
        Player player = new Player();
        String expected = null;
        String actual = null;
        switch (slot) {

            case 0:
                expected = "Pistol";
                actual = player.getWeapon(slot).getName();
                Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                break;
            case 1:
                expected = "Rpg";
                actual = player.getWeapon(slot).getName();
                Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                break;
            case 2:
                expected = "SnyperGun";
                actual = player.getWeapon(slot).getName();
                Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");

            case 3:
                expected = "MashinGun";
                actual = player.getWeapon(slot).getName();
                Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
        }
        System.out.println( "expected : " + expected + "\n" +
                            "actual : " + actual);
    }


    @BeforeAll
    public static void beforeAll() {
        System.out.println(" Запуск тестировщика! ");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println(" Тестирование выполнено! ");

    }


}
