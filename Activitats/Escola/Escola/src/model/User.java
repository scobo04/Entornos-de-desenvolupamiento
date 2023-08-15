package model;

public abstract class User implements Comparable<User> {
    private String dni;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String email;

    /* EJERCICIOS DE CLASE
        Nom, cognom1 i cognom2
        1- No poden tenir espais en blanc davant ni darrera.
                | Pep | -> |Pep|
        2- Totes les paraules han de començar en majúscula i
           la resta en minúscula.
                |JOAN TONI| -> |Joan Toni|
         3- No ha d'admetre cap accent ni ç ni ñ.
                |Llorenç| -> |Llorenc|
                |Miquel Àngel| -> |Miquel Angel|
                |Nuño| -> |Nuno|
     */


    public User(String dni, String nom, String cognom1, String cognom2, String email) {
        this.dni = dni;
        this.nom = nom;

        //E1
        this.nom = this.nom.trim();

        //E2
        String[] nomCompost = this.nom.split(" ");
        String nomCapitalitzat = "";
        for (int i = 0; i < nomCompost.length; i++) {
            nomCapitalitzat += nomCompost[i].toUpperCase().charAt(0) + nomCompost[i].substring(1);
        }
        this.nom = nomCapitalitzat;


        //E3
        this.nom = this.nom.replaceAll("ñ", "n");
        this.nom = this.nom.replaceAll("Ñ", "N");
        this.nom = this.nom.replaceAll("ç", "Ç");
        this.nom = this.nom.replaceAll("Ç", "c");
        this.nom = this.nom.replaceAll("à", "a");
        this.nom = this.nom.replaceAll("á", "a");
        this.nom = this.nom.replaceAll("À", "A");
        this.nom = this.nom.replaceAll("Á", "A");
        this.nom = this.nom.replaceAll("é", "e");
        this.nom = this.nom.replaceAll("è", "e");
        this.nom = this.nom.replaceAll("É", "E");
        this.nom = this.nom.replaceAll("È", "E");
        this.nom = this.nom.replaceAll("í", "i");
        this.nom = this.nom.replaceAll("ì", "i");
        this.nom = this.nom.replaceAll("Í", "I");
        this.nom = this.nom.replaceAll("Ì", "I");
        this.nom = this.nom.replaceAll("ó", "o");
        this.nom = this.nom.replaceAll("ò", "o");
        this.nom = this.nom.replaceAll("Ó", "O");
        this.nom = this.nom.replaceAll("Ò", "O");
        this.nom = this.nom.replaceAll("ú", "u");
        this.nom = this.nom.replaceAll("ù", "u");
        this.nom = this.nom.replaceAll("Ú", "U");
        this.nom = this.nom.replaceAll("Ù", "U");

        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.email = email;
    }

    protected String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public static String toMayusculas(String valor) {
        if (valor == null || valor.isEmpty()) {
            return valor;
        } else {
            return  valor.toUpperCase().charAt(0) + valor.substring(1, valor.length()).toLowerCase();
        }
    }

    /*public static String cambiarLetra(String valor) {
        if (valor.contains("ç")) {
            valor.replaceAll("")
        }
    }*/

    public String getNom() {
        //return nom;
        return toMayusculas(nom) + nom.replaceAll("ç", "c");
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        //return cognom1;
        return toMayusculas(cognom1) + nom.replaceAll("ç", "c");
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        //return cognom2;
        return toMayusculas(cognom2) + nom.replaceAll("ç", "c");
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

    /*
    cognom1 cognom2 nom

    0 si u i this són igual
    1 si this > u
    -1 si this < u
     */
    @Override
    public int compareTo(User u) {
        String u1 = this.getCognom1()+this.getCognom2()+this.getNom();
        String u2 = u.getCognom1()+u.getCognom2()+u.getNom();
        return u1.compareTo(u2);
    }


    @Override
    public String toString() {
        return "Usuari{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
