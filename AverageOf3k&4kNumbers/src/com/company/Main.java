package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int b = 0;
        System.out.println("Bir değer giriniz: ");
        int a= scanner.nextInt();

        for (int i = 1; i<a; i++){
            if (i%3 == 0 && i%4 == 0 ){
                average += i;
                b++;
            }

        }
        average = average / b;
        System.out.println(average);
    }
}
