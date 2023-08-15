import interficie.InterficieGrafica;
import interficie.TerminalInterface;
import interficie.UserInterface;
import model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    //MENÚ
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Escola iesManacor = new Escola("IES MANACOR");
        System.out.println("Que vas hacer?");
        System.out.println("1. agregar usuario");
        System.out.println("2. listar usuarios");
        System.out.println("3. eliminar usuario");
        System.out.println("4. modificar usuario");
        System.out.print("Escribe opcion: ");
        int j = sc.nextInt();
        boolean finish = false;
        while (!finish){
            switch (j){
                case 1:
                    // Crear
                    System.out.println("Que tipo de usuario mas ha agregar?");
                    System.out.println("1. profesor");
                    System.out.println("2. alumno");
                    int f = sc.nextInt();
                    System.out.print("DNI: ");
                    String dni = sc.next();
                    System.out.print("Nombre: ");
                    String nom = sc.next();
                    System.out.print("Apellido 1: ");
                    String cognom1 = sc.next();
                    System.out.print("Apellido 2: ");
                    String cognom2 = sc.next();
                    System.out.print("correo: ");
                    String email = sc.next();
                    if (f == 1){
                        System.out.print("Especialidad: ");
                        String especialitat = sc.next();
                        System.out.print("Departamento: ");
                        String departament = sc.next();

                        Professor profe = new Professor(/*TreballadorConcertat, */dni, nom,cognom1,cognom2,email,especialitat,departament);
                        try {
                            iesManacor.addUsuari(profe);
                        } catch (Exception e){
                            System.out.println("Error");
                        }
                    } else if (f == 2) {
                        System.out.print("Expediente: ");
                        String numeroExpedient = sc.next();
                        Alumne alu = new Alumne(dni,nom,cognom1,cognom2,email,numeroExpedient);
                        try {
                            iesManacor.addUsuari(alu);
                        } catch (Exception e){
                            System.out.println("Error");
                        }
                    }
                    finish = true;
                    break;
                case 2:
                    //listar
                    Usuari[] usuaris = iesManacor.llistaUsuari();
                    //Collections.sort(Arrays.stream(usuarios).toList());
                    Collections.sort(Arrays.asList(usuaris));
                    Arrays.sort(usuaris);
                    for (Usuari usuari : usuaris) {
                        System.out.println(" ");
                        System.out.println("Nombre: " + usuari.getNom());
                        System.out.println("Apellido 1: "+usuari.getCognom1());
                        System.out.println("Apellido 2: "+usuari.getCognom1());
                        if (usuari instanceof Alumne ){
                            System.out.println("Numero de exp: "+((Alumne) usuari).getNumeroExpedient());
                        }else if (usuari instanceof Professor){
                            System.out.println("Especialidad: "+((Professor) usuari).getEspecialitat());
                            System.out.println("Departamento: "+((Professor) usuari).getDepartament());
                        }

                    }
                    finish = true;
                    break;
                case 3:
                    // Eliminar
                    // TODO 1 - solicitar identificador (DNI)
                    System.out.print("DNI: ");
                    String dni2 = sc.next();
                    // TODO 2 - buscar posición en el array de usuarios
                    iesManacor.deleteUsuario(dni2);/*REVISAR*/
                    // TODO 3 - si existen coincidencias eliminar
                    finish = true;
                    break;
                case 4:
                    // Modificar

                    boolean terminado = false;

                    System.out.println("Introduce el DNI del usuario a modificar");
                    while(!terminado) {
                        // TODO 1 - solicitar identificador (DNI)
                        String dni1 = sc.next();

                        // TODO 2 - buscar posición en el array de usuarios
                        for (int i = 0; i < iesManacor.llistaUsuari().length; i++) {
                            Usuari usuari = iesManacor.llistaUsuari()[i];
                            if (usuari.getDni().equals(dni1)) {
                                System.out.println("Usuario encontrado: " + usuari.getNombreCompleto());

                                System.out.println("Qué quieres modificar?");
                                System.out.println("1 - DNI");
                                System.out.println("2 - Nombre");
                                System.out.println("3 - Apellido 1");
                                System.out.println("4 - Apellido 2");

                                // TODO if para saber si es alumno
                                if(usuari.getClass() == Alumne.class) {
                                    System.out.println("5 - Expediente");
                                }

                                // TODO if para saber si es profe
                                if(usuari.getClass() == Professor.class) {
                                    System.out.println("5 - Especialidad");
                                    System.out.println("6 - Departamento");
                                }
                                System.out.print("numero:  ");
                                int option = sc.nextInt();
                                switch (option){
                                    case 1:
                                        System.out.print("DNI: ");
                                        usuari.setDni(sc.next());
                                        break;
                                    case 2:
                                        System.out.print("Nombre: ");
                                        usuari.setNom(sc.next());
                                        break;
                                    case 3:
                                        System.out.print("Apellido 1: ");
                                        usuari.setCognom1(sc.next());
                                        break;
                                    case 4:
                                        System.out.print("Apellido 2: ");
                                        usuari.setCognom2(sc.next());
                                        break;
                                    case 5:
                                        if(usuari.getClass() == Alumne.class) {
                                            System.out.print("Expediente: ");
                                            ((Alumne) usuari).setNumeroExpedient(sc.next());
                                        }
                                        if(usuari.getClass() == Professor.class) {
                                            System.out.print("Especialidad: ");
                                            ((Professor) usuari).setEspecialitat(sc.next());
                                        }
                                        break;
                                    case 6:
                                        if(usuari.getClass() == Professor.class) {
                                            System.out.print("Departamento: ");
                                            ((Professor) usuari).setDepartament(sc.next());
                                        } else {
                                            System.out.println("Esta opcion no existe");
                                        }
                                        break;
                                    default:
                                        System.out.println("Esta opcion no existe");
                                        break;

                                }
                            }
                        }
                        System.out.println("El DNI no existe, prueba otra vez");


                    }

                    finish = true;
                    break;
                default:
                    // Te has equivoquido
                    System.out.println("Te has equivocado, prueba otra vez");
                    finish = true;
                    break;
            }
        }

        //AFEGIR HA DE DEMANAR SI ES ALUMNE O PROFESOR

        //Treballador treballadorPublic = new TreballadorPublic();
        Treballador treballadorConcertat = new TreballadorConcertat();

        Professor p = new Professor("dni", "Sergio", "Cobo", "", "sergio@gmail.com", "Informatica", "Programador");

        Alumne a = new Alumne("dni", "Jose", "Perez", "García", "jperez@gmail.com", "43553");
        Alumne b = new Alumne("dni", "Migue", "Poncho", "Matamarios", "migue@gmail.com", "75665");
        Alumne c = new Alumne("dni", "Santiago", "Revuelta", "Macintosh", "santi@gmail.com", "42543");
        Alumne d = new Alumne("dni", "Mario", "Tocahuevos", "Royal", "mario@gmail.com", "67576");

        //model.Usuari u = new model.Usuari();
        //model.Usuari[] tothom = llistarUsuaris();

        p.getDni();
        p.getEspecialitat();
        a.getNumeroExpedient();
        try {
            iesManacor.addUsuari(a);
            iesManacor.addUsuari(p);
            iesManacor.addUsuari(b);
            iesManacor.addUsuari(c);
            iesManacor.addUsuari(d);
        } catch (Exception e) {
            System.out.println("Fin");
        }

        try {
            iesManacor.llistaUsuari();
        } catch (Exception e) {}

        //Pintam els usuaris
        Usuari[] usuaris = iesManacor.llistaUsuari();
        for(int i = 0; i < usuaris.length; i++) {
            if (usuaris[i] == null) {
                break;
            }
            System.out.println("Dades de l'usuari: ");
            System.out.println("Nom: " + usuaris[i].getNom());
            System.out.println("Cognom 1: " + usuaris[i].getCognom1());
            System.out.println("Cognom 2: " + usuaris[i].getCognom2());
            if (usuaris[i] instanceof Alumne) {
                System.out.println("Número d'expedient: " + ((Alumne)usuaris[i]).getNumeroExpedient());
                System.out.println();
            } else if (usuaris[i] instanceof Professor) {
                System.out.println("Departament: " + ((Professor)usuaris[i]).getDepartament());
                System.out.println();
            }
        }
        Collections.sort(Arrays.stream(usuaris).toList());
            /* SEGUNDA FORMA
            for(int i = 0; i < usuaris.lenght; i++) {
                System.out.println("usuari: " + usuaris[i].getNom());
            }
            */
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));





        UserInterface userInterface = new TerminalInterface(iesManacor);
        userInterface.pintaMenu();

        System.out.println("Com vols la interfície?");
        System.out.println("1. Terminal");
        System.out.println("2. Altra - Gràfica");
        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();
        if (opcio == 1) {
            userInterface = new TerminalInterface(iesManacor);
        } else {
            userInterface = new InterficieGrafica();
        }

    }



    /*NO SE SI TENGO QUE QUITARLO
    public static Usuari[] llistarUsuaris() {

        //List<model.Professor> p = new ArrayList<>();
        return null;

    }*/

}
