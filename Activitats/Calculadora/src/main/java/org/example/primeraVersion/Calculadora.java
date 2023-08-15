package org.example.primeraVersion;

public class Calculadora {

    private int[] operadorsGeneral;
    private int operacioMatematicaGeneral;

    private Operador[] operadorsCalculadora;

    public Calculadora() {

        Operador suma = new Operador("SUMA", "+", 1);
        Operador resta = new Operador("RESTA", "-", 2);

        operadorsCalculadora = new Operador[2];
        operadorsCalculadora[0] = suma;
        operadorsCalculadora[1] = resta;

    }

    public void parse(String input) {

        //Llevar espais en blanc
        String operacio = input.replaceAll(" ", "");

        int operacioMatematica = 0; //1-suma 2-resta 3-mult 4-div
        int[] operadors = new int[2];

        for (int i = 0; i < this.operadorsCalculadora.length; i++) {

            if (operacio.contains(this.operadorsCalculadora[i].getSimbol())) {

                operacioMatematica = this.operadorsCalculadora[i].getValor();
                String[] operadorStr = operacio.split("\\" + this.operadorsCalculadora[i].getSimbol());
                for (int j = 0; j < operadorStr.length; j++) {
                    operadors[j] = Integer.parseInt(operadorStr[j]);
                }

            }

        }

        /*
        if (operacio.contains("+")) {
            operacioMatematica = 1;
            String[] operadorStr = operacio.split("\\+", 0);
            for (int i = 0; i < operadorStr.length; i++) {
                operadors[i] = Integer.parseInt(operadorStr[i]);
            }

        }
         */
        operadorsGeneral = operadors;
        operacioMatematicaGeneral = operacioMatematica;

    }

    public int[] getOperadorsGeneral() {

        return operadorsGeneral;

    }

    public void setOperadorsGeneral(int[] operadorsGeneral) {

        this.operadorsGeneral = operadorsGeneral;

    }

    public int getOperacioMatematicaGeneral() {

        return operacioMatematicaGeneral;

    }

    public void setOperacioMatematicaGeneral(int operacioMatematicaGeneral) {

        this.operacioMatematicaGeneral = operacioMatematicaGeneral;

    }

}
