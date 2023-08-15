package org.example.model;

import java.time.LocalDate;

public class Usuari {
    private int id; //Obligatori
    private String nom; //Obligatori
    private String cognom1; //Obligatori
    private String cognom2; //Opcional
    private String nick; //Opcional
    private LocalDate dataNaixement; //Obligatori
    private String email; //Obligatori
    private float winRate; //Opcional
    private String dninie; //Obligatori

    /*public Usuari(int id, String nom, String cognom1, String cognom2, String nick,
                  LocalDate dataNaixement, String email, float winRate, String dninie) {
        this.id = id;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.nick = nick;
        this.dataNaixement = dataNaixement;
        this.email = email;
        this.winRate = winRate;
        this.dninie = dninie;
    }*/

    public Usuari(UsuariBuilder builder) {
        builder.setNomCognom1("Sergio", "Cobo");
        builder.setCognom2("García");
        builder.setNick("scg");
        builder.setEmail("s@gmail.com");
        builder.setWinRate(2.56f);
        }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getNick() {
        return nick;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public String getEmail() {
        return email;
    }

    public float getWinRate() {
        return winRate;
    }

    public String getDninie() {
        return dninie;
    }
}
