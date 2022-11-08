package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// Ders notlarını kullanıcıdan alıp sınıfı geçip gecmediği sonucunu ekrana bastıran program
        int mat, fizik, turkce, kimya, muzik;
        System.out.println("Matematik notunuz: ");
        mat = scanner.nextInt();
        if (mat>100 || mat <0){
            System.out.println("Girdiğiniz not geçersiz");
        }

        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("Girdiğiniz not geçersiz");
        }

        System.out.println("Turkce notunuz: ");
        turkce = scanner.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("Girdiğiniz not geçersiz");
        }

        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("Girdiğiniz not geçersiz");
        }

        System.out.println("Müzik notunuz: ");
        muzik = scanner.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("Girdiğiniz not geçersiz");
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        if (average >= 55){
            System.out.println("Sınıfı geçtiniz, tebrikler..");
        }
        else{
            System.out.println("Sınıfta kaldınız :(((");
        }
        System.out.println("Ortalamanız: " + average);

    }
}
