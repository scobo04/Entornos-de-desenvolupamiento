package interficie;

import interficie.UserInterface;
import modelo.Alumne;
import modelo.Escola;

import java.util.Scanner;

public class TerminalInterface implements UserInterface {

    private boolean exit = false;
    private Escola escola;

    public TerminalInterface(Escola escola) {
        this.escola = escola;
    }

    @Override
    public void pintaMenu() {
        while (!exit) {
            System.out.println("Benvinguts a l'escola " + this.escola.getNom());
            System.out.println("Selecciona una opció: ");
            System.out.println("1. añadir");
            System.out.println("2. llistar");
            System.out.println("3. sortir");

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
                    this.exit = true;
                }
                default: {
                    System.out.println("Opció no válida");
                    System.out.println("----------------");
                    System.out.println("----------------");
                    System.out.println("----------------");
                    System.out.println("----------------");
                }
            }
        }
    }

    @Override
    public void afegirUsuari() {
        System.out.println("afegir usuari");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom");
        String nom = scanner.nextLine();
        System.out.println("Cognom 1");
        String cognom1 = scanner.nextLine();
        System.out.println("Cognom 2");
        String cognom2 = scanner.nextLine();

        Alumne alumne = new Alumne("", nom, cognom1, cognom2, "", "");
        this.escola.addUsuari(alumne);
    }

    @Override
    public void llistarUsuaris() {
        System.out.println("llistar usuaris");
    }
}