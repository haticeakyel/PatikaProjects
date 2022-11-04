package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenar uzunluğunu giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        int b = scanner.nextInt();
        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " +c);


    }
}
