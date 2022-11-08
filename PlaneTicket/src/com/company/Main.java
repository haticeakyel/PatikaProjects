package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = scanner.nextInt();

        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();
        if (distance <= 0 || age <=0){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else {
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            int travelType = scanner.nextInt();

            if (travelType ==1 || travelType ==2 ){
                double price = distance * 0.1;

                if(age <12){
                    price = price / 2;
                }
                else if (age>=12 && age <= 24){
                    price = price * 0.9;
                }
                else if (age >=65){
                    price = price * 0.7;
                }

                if (travelType == 2){
                    price = price * 0.8;
                    price = price * 2;
                }


                System.out.println("Toplam Tutar " + price + " TL");

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }





    }
}
