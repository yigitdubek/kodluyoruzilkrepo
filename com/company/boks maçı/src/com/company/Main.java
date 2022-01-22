package com.company;

public class Main {


        public static void main (String[]args){
            Figther f1 = new Figther("A",10,100,100,50);
            Figther f2 = new Figther("B",10,100,85,50);
            Match match =new Match(f1,f2,85,100);
            match.run();
        }
    }

