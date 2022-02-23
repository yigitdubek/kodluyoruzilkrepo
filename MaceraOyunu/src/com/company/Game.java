package com.company;

import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);



    public void game() {
        System.out.println("Oyuna Hoşgeldiniz");
        System.out.print("Karakterinizin ismnini giriniz:");
        String characterName = input.nextLine();
        Player player = new Player(characterName,null);
        System.out.println(player.getName() + "\tHoşgeldiniz");
        System.out.println("Karakter Türleri:");
        player.selectChar();
        Location location= null;
        while (true)
        {
            player.printInfo();
            System.out.println("###########Bölgeler################");
            System.out.println("1-Güvenli ev --> sizin için bir düşman yoktur.");
            System.out.println("2-Mağaza silah veya zırh alabilirsiniz.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);

            }
            if (!location.onlocation())
            {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
