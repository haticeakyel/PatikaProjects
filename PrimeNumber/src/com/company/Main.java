package com.company;

public class Main {

    public static void main(String[] args) {
	// find prime numbers between 1-100
        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(i);
            }
        }
    }
}