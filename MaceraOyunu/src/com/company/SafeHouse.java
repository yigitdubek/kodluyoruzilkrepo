package com.company;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Güvenli ev");
    }

    @Override
    public boolean onlocation() {
        System.out.println("Güvenli evdesiniz ve canınız yenilenecektir");

        return true;
    }
}
