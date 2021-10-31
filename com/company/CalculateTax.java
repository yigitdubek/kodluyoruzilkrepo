package com.company;
import java.util.Scanner;


public class CalculateTax {
    static float collectionTax;
    public static  void TakeTax(){
        Scanner tax = new Scanner(System.in);
        System.out.println("");
        float Cash = tax.nextFloat();
         if(Cash>1000)
            {
                collectionTax=(float) (Cash*(0.08));
             }
         else
            {
                collectionTax=(float) (Cash*(0.18));
            }     
            System.out.println(Cash+"KDV'siz fiyat");
            System.out.println("KDV'li fiyat"+collectionTax+Cash);
            System.out.println("KDV'li tutrı"+collectionTax);






    }
    
}