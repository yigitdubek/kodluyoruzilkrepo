package com.company;

import java.util.Scanner;

public class Player {
     private int damage;
     private int healthy;
     private int money;
     private String charName;
     private String name;
     private Inventory Inventory;
     
     Scanner input =new Scanner(System.in);
        Player(String name ,Inventory Inventory){
            this.name =name;
            this.Inventory= new Inventory();
        }



    public Inventory getInventory() {
        return Inventory;
    }

    public void setInventory(Inventory inventory) {
        Inventory = inventory;
    }

    public int getDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int health) {
        this.healthy = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(
                "Silahınız:"+this.getInventory().getWeapon().getName() +
                "\tHasar:"+this.getDamage()+
                "\tSağlığınız:"+this.getHealthy()+
                "\tParanız:"+this.getMoney());

    }

    public void selectChar(){
         GameChar charList []={new Samuray(),new Okçu(),new Sovalye()};
         System.out.println(" 1-Samuray Hasar:5 Sağlık:21 Para:15");
         System.out.println(" 2-Okçu Hasar:7 Sağlık:18 Para:20");
         System.out.println(" 3-Şovalye Hasar:8 Sağlık:24 Para:5");
         System.out.println("Lütfen bir karakter seçiniz:");
         int selectChar = input.nextInt();
         switch (selectChar){
             case 1: initPlayer(new Samuray());
             break;
             case 2: initPlayer(new Okçu());
             break;
             case 3: initPlayer(new Sovalye());
             break;
             default:initPlayer(new Sovalye());
         }
        System.out.println("Karakter:"+this.getCharName()+"\tDamage:"+this.getDamage() +"\tSağlığı:"+this.getHealthy() +"\tMoney:"+this.getMoney());
     }
     public void initPlayer(GameChar gameChar){
            this.setDamage(gameChar.getDamage());
            this.setHealthy(gameChar.getHealthy());
            this.setMoney(gameChar.getCash());
            this.setCharName(gameChar.getName());
     }


}
                                               