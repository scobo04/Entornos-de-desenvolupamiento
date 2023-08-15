package model;

public class Professor extends User {
    private String especialitat;
    private String departament;
    private Worker worker;

    //professor.getUsuari().getNom();
    //professor.getNom();


    public Professor(Worker t, String dni, String nom, String cognom1, String cognom2, String email, String especialitat, String departament) {
        super(dni, nom, cognom1, cognom2, email);
        this.especialitat = especialitat;
        this.departament = departament;
        this.worker = t;
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

    @Override
    public String getDni() {
        return this.getDni()+"z";
    }

    public int horesSuport(){
        float nomina = this.worker.calcularNomina();
        if(nomina<2000){
            return 2;
        } else {
            return 3;
        }
    }

    public void donarNotes(String nomDepartament, String aprovat, String suspes) {
        if (this.departament.equals(nomDepartament)) {
            System.out.println(suspes);
        } else {
            System.out.println(aprovat);
        }
        //Imprimir butlletí
        System.out.println("El teu butlletí.");
    }

    public void calcularNotes() {
        if (this.departament.equals("Informàtica")) {
            System.out.println("Suspès");
        } else {
            System.out.println("Aprovat");
        }

        //Calculant les notes...
        System.out.println("Calculant...");
    }

    //NO modificar valor dels paràmentres (IMPORTANTE)
    public int passarLlista(String dniAlumne, int faltes) {
        int faltesAux = faltes;

        //Comprovar si l'alumne assisteix
        faltesAux++;
        return faltesAux;
    }

    public void passarLlista(Alumne a) throws CloneNotSupportedException {
        Alumne b = new Alumne(a.getDni(), a.getNom(), a.getCognom1(), a.getCognom2(), a.getEmail(), a.getNumeroExpedient());
        Alumne c = (Alumne) a.clone();

        //Comprovar si l'alumne assisteix
        b.setCognom1("COGNOM MODIFICAT");
        System.out.println("Alumne dins funció: " + b.getCognom1());
    }

    //Per expulsar he posat el seu nom " - EXPULSAT"
    //Joan - EXPULSAT
    public String expulsar(Alumne a) {
        return a.getNom() + " - EXPULSAT";
    }
}
