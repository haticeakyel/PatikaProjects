package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar;
        double kdv = 0.18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucreti giriniz: ");
        tutar = scanner.nextDouble();
        double kdvTutar = tutar * kdv;
        double toplamTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + toplamTutar);



    }
}
