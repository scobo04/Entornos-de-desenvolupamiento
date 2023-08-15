package model;

/*
public class Professor extends Usuari, Treballador --> NO SE PUEDE HACER HERENCIA MÚLTIPLE PORQUE LUEGO
                                                       NO SE SABE DONDE SE DIRIGE.
*/

public class Professor extends Usuari {

    //SI NECESITAMOS ALGO DE OTRA CLASE LO CREAMOS, NO LO PONEMOS COMO HERENCIA
    //private ArrayList cursos;

    private String departament;
    private String especialitat;
    private Treballador treballador;

    //model.Professor.getUsuari().getNom();
    //model.Professor.getNom();


    public Professor(String dni, String nom, String cognom1, String cognom2, String email, String departament, String especialitat) {
        super(dni, nom, cognom1, cognom2, email);
        this.departament = departament;
        this.especialitat = especialitat;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }


}
