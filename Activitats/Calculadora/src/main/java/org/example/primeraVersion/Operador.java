package org.example.primeraVersion;

public class Operador {

    private String nom;
    private String simbol;
    private int valor;

    public Operador(String nom, String simbol, int valor) {

        this.nom = nom;
        this.simbol = simbol;
        this.valor = valor;

    }

    public String getNom() {
        return nom;
    }

    public String getSimbol() {
        return simbol;
    }

    public int getValor() {
        return valor;
    }
}
