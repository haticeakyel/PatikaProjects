package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.println("Ucuncu sayıyı giriniz: ");
        int c = scanner.nextInt();

        if (a<b && a<c)
        {
            if (b<c)
                System.out.println(a+" < "+b+" < "+c);
            else
                System.out.println(a+" < "+c+" < "+b);
        }

        if (b<a && b<c)
        {
            if (a<c)
                System.out.println(b+" < "+a+" < "+c);
            else
                System.out.println(b+" < "+c+" < "+a);
        }

        if (c<a && c<b)
        {
            if (a<b)
                System.out.println(c+" < "+a+" < "+b);
            else
                System.out.println(c+" < "+b+" < "+a);
        }
    }

}
