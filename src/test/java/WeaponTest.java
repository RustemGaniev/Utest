import Weapon.*;
import com.company.Player;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Time;

public class WeaponTest {


    @Test
    public void testChoosePistol() {

        String expected = " Пиф! Паф!";

        Weapon weapon = new Pistol();
        String actual = weapon.shot();

        Assertions.assertEquals(expected, actual, " Слот Пистолет работает некорректно ");
    }

    @Test
    public void weaponChooseTest() {
        int[] a = {0, 1, 2, 3};
        for (int slot : a) {

            Player player = new Player();
            System.out.println("Выбран слот " + slot);
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
                    break;
                case 3:
                    expected = "MashinGun";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
            }
            System.out.println("expected : " + expected + "\n" +
                    "actual : " + actual);
        }
    }

    @Test
    public void timeTest(){

        Player player = new Player();
        for (int i = 0; i < player.getSlotsCount(); i++){
            long startTime = System.currentTimeMillis();
            player.shotWithWeapon(i);
            long endTime = System.currentTimeMillis();
            long expected = 100;
            long actual = endTime - startTime;
            assert actual < expected : "Shooting time is too long!";
        }
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
