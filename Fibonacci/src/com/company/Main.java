package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 1, c, d;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the Fibonacci series: ");
        d = scanner.nextInt();
        System.out.print(a + ", " + b);

        for (int i = 2; i <= d; i++) {
            c = a + b;
            System.out.print(", " + c);
            b = c;
            System.out.print(" ");
        }
    }
}
