package model;

public class WorkerPrivat implements Worker {
    @Override
    public float calcularNomina() {
        //Connexió HTTP Conselleria
        return 3000;
    }

    @Override
    public float calcularIRPF() {
        //Connexió HTTP Conselleria
        return 17;
    }
}
