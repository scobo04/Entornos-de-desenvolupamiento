package org.example.model;

import java.time.LocalDate;

public class UsuariBuilder {
    private int id; //Obligatori
    private String nom; //Obligatori
    private String cognom1; //Obligatori
    private String cognom2; //Opcional
    private String nick; //Opcional
    private LocalDate dataNaixement; //Obligatori
    private String email; //Obligatori
    private float winRate; //Opcional
    private String dninie; //Obligatori


    /*public Usuari setId(int id) {
        this.id = id;
    }*/

    public UsuariBuilder() {
    }

/*RESOLVER Usuari sergio = new UsuariBuilder()
            .setNomCognom1("Sergio", "Cobo");*/

    public UsuariBuilder setNomCognom1(String nom, String cognom1) {
        this.nom = nom;
        this.cognom1 = cognom1;
        return this;
    }

    public UsuariBuilder setCognom2(String cognom2) {
        this.cognom2 = cognom2;
        return this;
    }

    public UsuariBuilder setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public UsuariBuilder setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
        return this;
    }

    public UsuariBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UsuariBuilder setWinRate(Float winRate) {
        this.winRate = winRate;
        return this;
    }

    public UsuariBuilder getDninie(String dninie) {
        this.dninie = dninie;
        return this;
    }

    /*RESOLVER public Usuari getResult() {
        return new Usuari(id, nom, cognom1, cognom2, nick, dataNaixement, email, winRate, dninie);
    }*/


    public UsuariBuilder(String cognom2) {
        this.cognom2 = cognom2;
    }

    public Usuari build() {
        Usuari usuari = new Usuari(this);
        return usuari;
    }

}
