package model;

public class TreballadorPrivat implements Treballador {

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
