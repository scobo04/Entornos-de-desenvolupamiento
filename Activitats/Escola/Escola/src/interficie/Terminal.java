package interficie;

import model.Alumne;
import model.Escola;
import model.Professor;
import model.User;

import java.util.Scanner;

public class Terminal implements UserInterface{
    private boolean exit = false;
    private Escola escola;

    public Terminal(Escola escola) {
        this.escola = escola;
    }

    @Override
    public void pintaMenu() throws Exception {
        while(!exit) {
            System.out.println("Benvinguts a l'escola "+this.escola.getNom());
            System.out.println("Selecciona una opció:");
            System.out.println("   1- Afegir usuari");
            System.out.println("   2- Llistar usuaris");
            System.out.println("   3- Sortir");
            Scanner scanner = new Scanner(System.in);
            int opcio = scanner.nextInt();
            switch (opcio) {
                case 1: {
                    this.afegirUsuari();
                    break;
                }
                case 2: {
                    this.llistarUsuaris();
                    break;
                }
                case 3: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Opció no vàlida");
                    System.out.println("----------------");
                    System.out.println("----------------");
                    System.out.println("----------------");
                    System.out.println("----------------");
                }
            }
        }
    }

    @Override
    public void afegirUsuari() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Afegint un alumne");
        System.out.println("Nom");
        String nom = scanner.nextLine();
        System.out.println("Cognom 1");
        String cognom1 = scanner.nextLine();
        System.out.println("Cognom 2");
        String cognom2 = scanner.nextLine();

        Alumne alumne = new Alumne("",nom,cognom1,cognom2,"","");
        this.escola.addUsuari(alumne);
    }

    @Override
    public void llistarUsuaris() {
        User[] users = this.escola.llistaUsuaris();
        for(int i = 0; i< users.length; i++){
            System.out.println("Dades de l'usuari:");
            System.out.println("Nom: "+ users[i].getNom());
            System.out.println("Cognom 1: "+ users[i].getCognom1());
            System.out.println("Cognom 2: "+ users[i].getCognom2());
            if(users[i] instanceof Alumne){
                System.out.println("Número d'expedient: "+((Alumne) users[i]).getNumeroExpedient());
            } else if(users[i] instanceof Professor){
                System.out.println("Departament: "+((Professor) users[i]).getDepartament());
            }
        }
    }
}
