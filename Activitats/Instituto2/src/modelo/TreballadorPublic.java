package modelo;

public class TreballadorPublic implements Treballador {
    @Override
    public float calcularNomina() {
        //Connexió HTTP Conseleria
        return 1500;
    }

    @Override
    public float calcularIRPF() {
        return 0;
    }
}
