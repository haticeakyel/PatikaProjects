package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz: ");
        int r = scanner.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
    }
}
