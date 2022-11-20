package com.company;

import java.util.Scanner;

public class Main {

        static boolean ifPrime(int number){
            int count=0;
            for (int i=2;i<number;i++){
                if(number%i==0){
                    count++;
                }
            }
            if (count==0){
                System.out.println("It is prime number.");
                return true;
            }else{
                System.out.println("It is not prime number.");
                return false;
            }
        }

        public static void main(String[] args) {
            while (true){
                Scanner scanner=new Scanner(System.in);
                System.out.println("Please enter a number to check is it prime or not:");
                int number= scanner.nextInt();
                ifPrime(number);


            }    }
}
