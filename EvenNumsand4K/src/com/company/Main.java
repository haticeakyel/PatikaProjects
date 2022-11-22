package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger = 0,toplam = 0;
        while (deger % 2 == 0)
        {
            System.out.println("Deger Giriniz:");
            deger = input.nextInt();
            if(deger % 2 == 0 && deger % 4 == 0)
                toplam += deger;

        }
        System.out.println("Toplam: "+ toplam);

    }
}
