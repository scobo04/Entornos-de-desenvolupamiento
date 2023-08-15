package model;

public class WorkerConcertat implements Worker {
    private static final float PI = 3.14159f;
    //1- Rename
    //2- Extreure una constant
    //3- Extreure una variable
    //4- Extreure un mètode
    

    @Override
    public float calcularNomina() {
        comprovarPemisos();

        //Connexió HTTP Conselleria
        int nomina = 1300;
        return nomina + 100 * PI;
    }

    private static void comprovarPemisos() {
        boolean treballador = true;
        if (treballador && 4 < PI) {
            int x = 45;
        }
    }

    @Override
    public float calcularIRPF() {
        comprovarPemisos();

        //Connexió HTTP Conselleria
        int irpf = 17;
        return irpf * PI;
    }
}
