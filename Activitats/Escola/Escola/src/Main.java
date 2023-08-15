import model.*;
import interficie.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //Treballador treballadorPublic = new TreballadorPublic();
        Worker workerConcertat = new WorkerConcertat();

        Professor p = new Professor(workerConcertat,"dni","Joan profe","Galmes","Riera","fjwioe","jeiowjfi","Info");
        Alumne a = new Alumne("dni","Joan alumne","Galmes","Riera","fjwioe","jeiowjfi");

        Escola iesManacor = new Escola("IES Manacor");
        try {
            iesManacor.addUsuari(a);
            iesManacor.addUsuari(p);
        } catch (Exception e){}

        //Pintem els usuaris
        User[] users = iesManacor.llistaUsuaris();
        List<User> usuarisList = new ArrayList<>(Arrays.stream(users).toList());
        Collections.sort(usuarisList);



        UserInterface userInterface;

        System.out.println("Com vols la interfície?");
        System.out.println("   1- Terminal");
        System.out.println("   Altra- Gràfic");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();
        if(opcio==1){
            userInterface = new Terminal(iesManacor);
        } else {
            userInterface = new InterficieGrafica(iesManacor);
        }

        userInterface.pintaMenu();

        //Demostrar per què no modifcar un paràmetre
        int faltes = 5;
        int faltesNoves = p.passarLlista("736362", faltes);
        System.out.println("\nFaltes: " + faltes + "\nFaltes noves: " + faltesNoves);

        //Alumne a
        a.setCognom1(("COGNOM SENSE MODIFICAR"));
        System.out.println("\nCognom alumne abans: " + a.getCognom1());
        p.passarLlista(a);
        System.out.println("Cognom alumne després: " + a.getCognom1());

        //Expulsem l'alumne
        String nomExpulsat = p.expulsar(a);
        a.setNom(nomExpulsat);
        System.out.println(nomExpulsat);
    }
}