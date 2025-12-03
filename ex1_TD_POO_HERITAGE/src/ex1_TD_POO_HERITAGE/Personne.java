package ex1_TD_POO_HERITAGE;

public class Personne {
    // Attributs privés
    private String Nom;
    private int Enfant;

    // Constructeur
    public Personne(String Nom, int Enfant) {
        this.Nom = Nom;
        this.Enfant = Enfant;
    }

    // Getter
    public String getNom() {
        return Nom;
    }

    public int getEnfant() {
        return Enfant;
    }
}

