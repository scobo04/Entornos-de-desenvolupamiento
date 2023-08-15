public class Operacio {

    private int operacio;
    private int operador1;
    private int operador2;

    public Operacio(int operacio, int operador1, int operador2) {
        this.operacio = operacio;
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public int getOperacio() {
        return operacio;
    }

    public int getOperador1() {
        return operador1;
    }

    public int getOperador2() {
        return operador2;
    }
}
