package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kg = scanner.nextInt();
        double index = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + index);

    }
}
