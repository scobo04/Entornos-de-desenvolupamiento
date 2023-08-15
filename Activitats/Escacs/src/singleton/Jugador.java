package singleton;

public class Jugador {
    private static Jugador jugador;
    private String nom;

    private Jugador() {

    }

    public static Jugador getInstance() {
        if (jugador == null) {
            jugador = new Jugador();
        }
        return jugador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
