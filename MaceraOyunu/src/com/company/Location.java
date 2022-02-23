package com.company;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    public static Scanner input =new Scanner(System.in);

    public Location(Player player,String name) {
        this.player=player;
    }

    public void location(){

    }
    public  abstract  boolean onlocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
