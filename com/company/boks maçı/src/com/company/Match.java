package com.company;

public class Match {
    Figther f1;
    Figther f2;
    int minWeight;
    int maxWeight;
    Match(Figther f1,Figther f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    public void run(){
        if (isCheck()){
            int randomNUMBER = (int) (Math.random() * 100);
            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("==== YENİ ROUND ======");
                if (randomNUMBER%2==1){
                    f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                }
                else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                randomNUMBER++;
                System.out.println(f1.name + " " + "Sağlık=" + f1.health);
                System.out.println(f2.name + " " + "Sağlık=" + f2.health);

            }
        }
        else{
            System.out.println("Sporcuların sikletleri uygun değildir");
        }
    }
    boolean isCheck(){
        return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight) &&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(f2.name + "kazandı.");
            return true;
        }
        else if (this.f2.health==0){
            System.out.println(f1.name + "kazandı.");
            return true;
        }
        return false;
    }

}
