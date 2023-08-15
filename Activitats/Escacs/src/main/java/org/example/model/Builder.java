package org.example.model;

import java.time.LocalDate;

public interface Builder {
    void setId(int id);
    void setNomCognom1(String nom, String cognom1);
    void setCognom2(String cognom2);
    void setNick(String nick);
    void setDataNaixement(LocalDate dataNaixement);
    void setEmail(String email);
    void setWinRate(Float winRate);
    void setDniNie(String dniNie);
}
