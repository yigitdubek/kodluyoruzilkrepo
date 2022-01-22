package com.company;

public class Figther {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Figther(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }
    int hit(Figther foe){
        System.out.println(this.name+" => "+foe.name+ " " + this.damage + "hasar vurdu." );
        if (foe.isDodge()){
            System.out.println(foe.name +"geelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health <= this.damage){
            return 0;
        }

            return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNUMBER= Math.random()*100;
        return randomNUMBER<=this.dodge;

    }
}
