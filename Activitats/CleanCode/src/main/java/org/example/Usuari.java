package org.example;

public class Usuari {

    String nom;
    String cognoms;
    int edat;

    public Usuari(String nom, String cognoms, int edat) {

        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.saludar();

    }

    public String saludar() {

            return "El meu nom és " + this.nom + " " + this.cognoms;

    }

}
