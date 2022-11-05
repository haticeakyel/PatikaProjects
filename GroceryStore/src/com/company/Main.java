package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        final DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Armut Kaç Kilo ? :");
        double armutK = scanner.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        double elmaK = scanner.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        double domatesK = scanner.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        double muzK = scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlicanK = scanner.nextDouble();

        double toplam = (armut * armutK) + (elma * elmaK) + (domates * domatesK) + (muz * muzK) + (patlican * patlicanK);

        System.out.println("Toplam tutar: " + df.format(toplam));
    }
}
