package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        // değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        // kendisine eşit olan sayıya mükemmel sayı denir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<number; i++){
            if (number % i == 0){
               sum += i; 
            }
        }
        if (sum == number){
            System.out.println(number + " mükemmel sayıdır.");
        }
        else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
