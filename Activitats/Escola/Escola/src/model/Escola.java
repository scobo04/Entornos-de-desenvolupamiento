package model;

public class Escola {
    private String nom;
    private User[] users;
    private static final int MAX_USERS = 5;
    private int darrer;

    public Escola(String nom) {
        this.nom = nom;
        this.users = new User[MAX_USERS];
        darrer = 0;
    }

    public String getNom() {
        return nom;
    }


    public void addUsuari2(User user){
        try {
            this.users[darrer] = user;
            darrer++;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Escola plena.");
        } catch (Exception e){
            System.out.println("Error desconegut.");
        }
    }

    public void addUsuari(User user) throws Exception {
        if(darrer < MAX_USERS) {
            this.users[darrer] = user;
            darrer++;
        } else {
            throw new Exception("Nombre màxim d'usuaris a l'escola.");
        }
    }

    public User[] llistaUsuaris(){
        User[] users = new User[darrer];
        //Emplenar array amb els usuaris
        for(int i = 0; i< users.length; i++){
            users[i] = this.users[i];
        }
        return users;
    }


}
