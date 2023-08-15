package modelo;

public abstract class Usuari implements Comparable<Usuari> {

    private String dni;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String email;
    private String nombreCompleto;

    public Usuari(String dni, String nom, String cognom1, String cognom2, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.email = email;
        this.nombreCompleto = nom + " " + cognom1 + " " + cognom2;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Usuari u) {
        if ( this.getCognom1().compareTo(u.getCognom1()) == 0) {

            String u1 = this.getCognom1()+" "+this.getCognom2()+" "+this.getNom();
            String u2 = u.getCognom1()+" "+u.getCognom2()+" "+u.getNom();

            return u1.compareTo(u2);

        }

        return 2;//DUDO

    }



}
