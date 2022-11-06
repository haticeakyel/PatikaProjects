package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.println("Kullanıcı Adınız: ");
        username = scanner.nextLine();

        System.out.println("Sifreniz: ");
        password = scanner.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("You logged in the system!");
        }
        else{
            System.out.println("You made something wrong.");
            System.out.println("Do you want to change password? Enter y for yes n for no: ");
            String answer = scanner.nextLine();
            if (answer.equals("y")){
                System.out.println("Please enter new password: ");
                String newPassword = scanner.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("New password can't be the same with the old one");

                }
                else{
                    System.out.println("Password changed");
                }
            }
            else{
                System.out.println("Please try to login again...");
            }
        }
    }
}
