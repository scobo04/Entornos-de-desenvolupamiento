package model;

public class TreballadorConcertat implements Treballador {


    @Override
    public float calcularNomina() {
        //HTTP conselleria
        return 1500;
    }

    @Override
    public float calcularIRPF() {
        // HTTP conselleria
        return 17;
    }
}
