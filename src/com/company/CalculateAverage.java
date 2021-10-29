package com.company;
import java.util.Scanner;


public class CalculateAverage {

    public static  void Average (){
        Scanner lesson =  new Scanner( System.in);
        System.out.println("Matematik notunuzu girin");
        int math = lesson.nextInt();
        System.out.println("Fizik notunuzu girin");
        int physic = lesson.nextInt();
        System.out.println("Müzik notunuzu girin");
        int music = lesson.nextInt();
        System.out.println("Tarih notunuzu girin");
        int hıst = lesson.nextInt();
        System.out.println("Kimya notunuzu girin");
        int chm = lesson.nextInt();
        System.out.println("Türkçe notunuzu girin");
        int turk = lesson.nextInt();

        float average = (math+physic+music+hıst+chm+turk)/6;
        if (average >= 60){
            System.out.println(average+" ile sınıfı geçti.");
        }
        else {
            System.out.println(average+" ile sınıfta kaldı.");

        }

    }


}
