package com.company;

import java.util.Scanner;

//Girilen yılın artık yıl olup olmağını kontrol eden program

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int year = scanner.nextInt();

        if (year%100 == 0 && year%400==0){
            System.out.println(year + " bir artık yıldır.");
        }
        else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
