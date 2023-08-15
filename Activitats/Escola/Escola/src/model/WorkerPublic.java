package model;

public class WorkerPublic implements Worker {
    private int numFuncionari;

    public WorkerPublic(int numFuncionari) {
        this.numFuncionari = numFuncionari;
    }

    public int getNumFuncionari() {
        return numFuncionari;
    }

    @Override
    public float calcularNomina() {
        //Connexió HTTP Conselleria
        return 1500;
    }

    @Override
    public float calcularIRPF() {
        //Connexió HTTP Conselleria
        return 17;
    }
}
