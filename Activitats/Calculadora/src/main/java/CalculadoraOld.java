import java.util.Scanner;

public class CalculadoraOld {
    private static int[] operadorsGeneral;
    private static int operacioMatematicaGeneral;

    public static void mainOld(String[] args) {
        System.out.println("Benvinguts a la calculadora");
        demanarOperacio();
        int resultat = operar(operadorsGeneral[0],operadorsGeneral[1],operacioMatematicaGeneral);
        System.out.println("El resultat de "+
                operadorsGeneral[0]+" "+
                operacioMatematicaGeneral+" "+
                operadorsGeneral[1]+" "+
                "és igual a "+
                resultat);
    }

    public static void demanarOperacio(){
        // 3+2 --> 3 + 2
        Scanner read = new Scanner(System.in);
        String operacio = read.nextLine();

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
        operadorsGeneral = operadors;
        operacioMatematicaGeneral = operacioMatematica;
    }

    public static int operar(int op1, int op2, int operacio){
        if(operacio==1){
            return sumar(op1, op2);
        }
        return 0;
    }

    public static int sumar(int op1, int op2){
        return  op1 + op2;
    }

}