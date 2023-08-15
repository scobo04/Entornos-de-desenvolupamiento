package modelo;

public class Escola {

    private String nom;

    private Usuari[] usuaris;
    //private ArrayList<Usuari> usuari;

    private static final int MAX_USERS = 1000;
    private int darrer;
    private int eliminat = 0;


    public Escola(String nom) {
        this.nom = nom;
        this.usuaris = new Usuari[MAX_USERS];
        darrer = 0;
    }

    public void addUsuari(Usuari usuari) {
        //usuaris.add(usuari);

        /* OPCION 1 */
        try{
            this.usuaris[darrer] = usuari;
            darrer++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Escola plena.");
        } catch (Exception e){
            System.out.println("Error desconegut.");
        }

        /* OPCION 2 */
        /*
        if (LAST_INSERT < MAX_USERS) {
            this.usuaris[LAST_INSERT] = usuari;
            LAST_INSERT++;
        } else {
            throw new Exception("Nombre màxim d'usuaris.");
        }
        */
    }

    public void deleteUsuario (String dni) {
        /*this.usuaris[darrer] = usuari;
        darrer++;*/
    }

    public void swapUsario (Usuari usuario ) {
        this.usuaris[darrer] = usuario;
        darrer++;
    }

    public Usuari[] llistaUsuari() {
        Usuari[] usuaris = new Usuari[darrer];
        //Usuari[] usuaris = new Usuari[darrer];
        //Emplenar array amb els usuaris
        for (int i = 0; i < usuaris.length; i++) {
            usuaris[i] = this.usuaris[i];
        }
        return usuaris;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
