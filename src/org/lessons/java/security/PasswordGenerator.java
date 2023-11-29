package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserire il  nome");
        String name = scanner.nextLine();

        System.out.println("Inserire il  cognome");
        String surname = scanner.nextLine();

        System.out.println("Inserire il  colore preferito");
        String favouriteColor = scanner.nextLine();

        System.out.println("Inserire il  giorno di nascita");
        int dayOfBirth  = scanner.nextInt();

        System.out.println("Inserire il  mese di nascita sottoforma di numero");
        int monthOfBirth  = scanner.nextInt();

        System.out.println("Inserire l' anno di nascita");
        int yearOfBirth  = scanner.nextInt();

        int sumOfBirth = dayOfBirth + monthOfBirth + yearOfBirth;
        System.out.println("La tua password è: ");
        System.out.println(name + "-" + surname + "-" + favouriteColor + "-" + sumOfBirth);

        scanner.close();
    }
}
