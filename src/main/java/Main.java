import com.company.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      Player player = new Player();

        System.out.format("У игрока %d слотов с оружием : " +
                        "1. Пистолет 2. РПГ  3. Снайперская винтовка  4. Пулемет"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            slot = scanner.nextInt();

            if (slot <= -2 || slot >= player.getSlotsCount()) {
                System.out.println(" Такого оружия нет! Выберите номер слота с оружием еще раз! ");

                continue; }

            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }

}

