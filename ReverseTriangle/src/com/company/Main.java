package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        int step;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç basamaklı bir ters ücgen istediğinizi giriniz:");
        step = scanner.nextInt();

        for (int h = step; h >= 1; h--) {
            for (int b = 1; b <= step - (h-1); b++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= (2 * h) - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
