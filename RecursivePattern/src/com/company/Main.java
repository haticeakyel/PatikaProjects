package com.company;

import java.util.Scanner;

public class Main {

    public static int power(int a, int b) {
        if (b != 0) {
            return (a * power(a, b - 1));
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base: ");
        int base = scanner.nextInt();
        System.out.println("Please enter a pow: ");
        int pow = scanner.nextInt();


        System.out.println("Result: " + power(base,pow));

    }

}
