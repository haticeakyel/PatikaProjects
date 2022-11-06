package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, choice;
        System.out.println("Please enter first number: ");
        x1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        x2 = scanner.nextInt();
        System.out.println("1.Adding\n2.Subtraction\n3.Multiply\n4.Divide\n");
        System.out.println("Please enter number to select your operation: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Result is: " + (x1 + x2));
                break;
            case 2:
                System.out.println("Result is: " + (x1 - x2));
                break;
            case 3:
                System.out.println("Result is: " + (x1 * x2));
                break;
            case 4:
                if (x2 == 0){
                    System.out.println("You can't divide by 0");
                }
                else{
                    System.out.println("Result is: " + (x1 / x2));
                }
                break;
            default:
                System.out.println("You made something wrong");
        }

    }
}
