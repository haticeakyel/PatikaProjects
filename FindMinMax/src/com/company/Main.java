package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
        
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0, temp;

        System.out.println("Kaç tane sayı gireceksiniz: ");
        int number = scanner.nextInt();

        for (int i=1;i<=number;i++){
            System.out.print(i+". sayıyı giriniz: ");
            int num=scanner.nextInt();

            temp=max;
            max=num;

            if(temp>num){
                max=temp;
                min=num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
}
