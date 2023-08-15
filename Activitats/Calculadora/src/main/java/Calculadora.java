public class Calculadora {

    private Terminal terminal;
    //private int[] operadorsGeneral;
    //private int operacioMatematicaGeneral;

    /*
    public Calculadora() {
        this.terminal = new Terminal();
    }*/

    public Calculadora(Terminal terminal) {
        this.terminal = terminal;
    }

    /*
    //getter
    public Terminal getTerminal() {
        return this.terminal;
    }

    //setter
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    */

    public Operacio demanarOperacio(){
        //Terminal terminal = new Terminal();
        //System.out.println("Hash code" + terminal.hashCode());

        // 3+2 --> 3 + 2
        String operacio = terminal.input();

        //Llevar espais en blanc
        operacio = operacio.replaceAll(" ","");

        int operacioMatematica = 0; //1-suma 2-resta 3-mult 4-div
        int[] operadors = new int[2];
        if(operacio.contains("+")){
            operacioMatematica = 1;
            String[] operadorsStr = operacio.split("\\+",0);
            for(int i=0; i<operadorsStr.length; i++){
                operadors[i] = Integer.parseInt(operadorsStr[i]);
            }
        }

        //operadorsGeneral = operadors;
        //operacioMatematicaGeneral = operacioMatematica;

        Operacio operacio1 = new Operacio(operacioMatematica, operadors[0], operadors[1]);
        return operacio1;

    }

    public void escriureResultat(Terminal terminal) {

        terminal.output("resultat");

    }

    //CODIGO NUEVO operar
    public int operar(int op1, int op2, int operacio) {
        if (operacio == 1) {
            return sumar(op1, op2);
        }
        return 0;
    }

    //CODIGO ANTIGUO operar
    /*public static int operar(){
        if(operacio==1){
            return sumar(op1, op2);
        }
        return 0;
    }*/

    public static int sumar(int op1, int op2){
        return  op1 + op2;
    }

}
