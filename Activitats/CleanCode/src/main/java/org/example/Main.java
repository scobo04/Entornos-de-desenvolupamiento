package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Sorts.inverteix(new int[]{2,3,4});

        Usuari pep = new Usuari("Pep", "García", 20);
        Usuari antoni = new Usuari("Antoni", "Grimalt", 65);
        Usuari paco = new Usuari("Paco", "Bassa", 42);

        System.out.println("\n" + pep.saludar());
        System.out.println(antoni.saludar());
        System.out.println(paco.saludar());

    }
}